package com.mikkaeru.transaction.kafka.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mikkaeru.transaction.model.Transaction;

import java.math.BigDecimal;

public class TransactionEvent {

    private @JsonProperty String id;
    private @JsonProperty BigDecimal valor;
    private @JsonProperty CardKafkaRequest cartao;
    private @JsonProperty EstablishmentKafkaRequest estabelecimento;

    public Transaction toModel() {
        return new Transaction(cartao.toModel(), valor, id, estabelecimento.toModel());
    }
}
