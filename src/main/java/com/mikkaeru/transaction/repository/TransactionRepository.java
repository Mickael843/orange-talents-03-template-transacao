package com.mikkaeru.transaction.repository;

import com.mikkaeru.transaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query(value = "SELECT * FROM transaction t INNER JOIN card c WHERE t.card_id = c.id AND c.card_number = ?1 ORDER BY t.id desc LIMIT ?2", nativeQuery = true)
    List<Transaction> findLast(String cardId, int number);
}
