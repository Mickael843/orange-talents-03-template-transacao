package com.mikkaeru.transaction.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mikkaeru.transaction.model.Card;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@JsonInclude(NON_NULL)
public class CardResponse {

    @JsonProperty
    private String email;
    @JsonProperty
    private String cardNumber;

    public CardResponse(Card card) {
        this.email = card.getEmail();
        this.cardNumber = card.getCardNumber();
    }
}
