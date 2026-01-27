package com.expensetracker.expense_tracker.service;

import com.expensetracker.expense_tracker.model.Expense;
import com.expensetracker.expense_tracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repo;

    public Expense addExpense(Expense expense) {
        return repo.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return repo.findAll();
    }

    public List<Expense> getByMonth(int month) {
        return repo.findByMonth(month);
    }

    public Double getMonthlyTotal(int month) {
        return repo.getMonthlyTotal(month);
    }

    public Expense updateExpense(Long id, Expense expense) {
        Expense existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Expense not found"));

        existing.setTitle(expense.getTitle());
        existing.setAmount(expense.getAmount());
        existing.setDate(expense.getDate());

        return repo.save(existing);
    }

    public void deleteExpense(Long id) {
        repo.deleteById(id);
    }
}
