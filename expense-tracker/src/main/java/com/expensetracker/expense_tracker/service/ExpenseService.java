package com.expensetracker.expense_tracker.service;

import com.expensetracker.expense_tracker.model.Expense;
import com.expensetracker.expense_tracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository repository;

    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public Expense addExpense(Expense expense) {
        return repository.save(expense);
    }

    // READ
    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    // DELETE
    public void deleteExpense(Long id) {
        repository.deleteById(id);
    }

    // MONTH-WISE TOTAL
    public Double calculateMonthlyTotal(int month) {
        Double total = repository.getMonthlyTotal(month);
        return total != null ? total : 0.0;
    }
}

