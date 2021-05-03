package com.mikkaeru.transaction.kafka.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mikkaeru.transaction.model.Card;

public class CardKafkaRequest {

    private @JsonProperty String id;
    private @JsonProperty String email;

    public Card toModel() {
        return new Card(this.email, this.id);
    }
}
