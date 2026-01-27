package com.expensetracker.expense_tracker.controller;

import com.expensetracker.expense_tracker.model.Expense;
import com.expensetracker.expense_tracker.repository.ExpenseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
@CrossOrigin(origins = "*")
public class ExpenseController {

    private final ExpenseRepository repo;

    public ExpenseController(ExpenseRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return repo.save(expense);
    }

    @GetMapping
    public List<Expense> getAll() {
        return repo.findAll();
    }

    @GetMapping("/month/{month}")
    public List<Expense> getByMonth(@PathVariable int month) {
        return repo.findByMonth(month);
    }

    @GetMapping("/month/{month}/total")
    public Double getTotal(@PathVariable int month) {
        return repo.getMonthlyTotal(month);
    }

    @PutMapping("/{id}")
    public Expense update(@PathVariable Long id,
                          @RequestBody Expense expense) {

        Expense ex = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Not Found"));

        ex.setTitle(expense.getTitle());
        ex.setAmount(expense.getAmount());
        ex.setDate(expense.getDate());

        return repo.save(ex);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
