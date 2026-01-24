package com.expensetracker.expense_tracker.repository;

import com.expensetracker.expense_tracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    // Get expenses for a specific month
    @Query("SELECT e FROM Expense e WHERE MONTH(e.date) = :month")
    List<Expense> findExpensesByMonth(@Param("month") int month);

    // Get total expense for a specific month
    @Query("SELECT SUM(e.amount) FROM Expense e WHERE MONTH(e.date) = :month")
    Double getMonthlyTotal(@Param("month") int month);
}
