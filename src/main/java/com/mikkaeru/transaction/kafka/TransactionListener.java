package com.mikkaeru.transaction.kafka;

import com.mikkaeru.transaction.kafka.model.TransactionEvent;
import com.mikkaeru.transaction.repository.TransactionRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionListener {

    private final TransactionRepository transactionRepository;

    public TransactionListener(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void listen(TransactionEvent event) {
        // TODO Aplicar um log nessa linha.
        transactionRepository.save(event.toModel());
    }
}
