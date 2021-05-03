package com.mikkaeru.transaction.controller;

import com.mikkaeru.transaction.dto.TransactionResponse;
import com.mikkaeru.transaction.model.Transaction;
import com.mikkaeru.transaction.repository.TransactionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cards/{id}/transactions")
public class TransactionController {

    private final TransactionRepository transactionRepository;

    public TransactionController(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @GetMapping
    public ResponseEntity<?> getLastTenTransactions(@PathVariable String id) {
        List<Transaction> transactions = transactionRepository.findLast(id, 10);

        if (transactions.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(transactions.stream().map(TransactionResponse::new).collect(Collectors.toList()));
    }
}
