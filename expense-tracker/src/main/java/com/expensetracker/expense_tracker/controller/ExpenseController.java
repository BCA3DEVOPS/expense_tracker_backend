package com.expensetracker.expense_tracker.controller;

import com.expensetracker.expense_tracker.model.Expense;
import com.expensetracker.expense_tracker.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin("*")
public class ExpenseController {

    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return service.addExpense(expense);
    }

    // READ
    @GetMapping
    public List<Expense> getAllExpenses() {
        return service.getAllExpenses();
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        service.deleteExpense(id);
    }

    // MONTH-WISE TOTAL
    @GetMapping("/month/{month}")
    public Double getMonthlyTotal(@PathVariable int month) {
        return service.calculateMonthlyTotal(month);
    }
}

