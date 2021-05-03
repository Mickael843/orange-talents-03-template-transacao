package com.mikkaeru.transaction.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mikkaeru.transaction.model.Transaction;

import java.math.BigDecimal;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@JsonInclude(NON_NULL)
public class TransactionResponse {

    @JsonProperty
    private BigDecimal value;
    @JsonProperty
    private CardResponse card;
    @JsonProperty
    private String transactionId;
    @JsonProperty
    private EstablishmentResponse establishment;

    public TransactionResponse(Transaction transaction) {
        this.value = transaction.getValue();
        this.transactionId = transaction.getTransactionId();
        this.card = new CardResponse(transaction.getCard());
        this.establishment = new EstablishmentResponse(transaction.getEstablishment());
    }
}
