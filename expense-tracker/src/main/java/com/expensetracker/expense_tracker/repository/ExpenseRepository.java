package com.expensetracker.expense_tracker.repository;

import com.expensetracker.expense_tracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    @Query("SELECT e FROM Expense e WHERE MONTH(e.date) = :month")
    List<Expense> findByMonth(int month);

    @Query("SELECT COALESCE(SUM(e.amount),0) FROM Expense e WHERE MONTH(e.date) = :month")
    Double getMonthlyTotal(int month);
}
