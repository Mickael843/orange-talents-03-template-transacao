package com.mikkaeru.transaction.kafka.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mikkaeru.transaction.model.Establishment;

public class EstablishmentKafkaRequest {

    private @JsonProperty String nome;
    private @JsonProperty String cidade;
    private @JsonProperty String endereco;

    public Establishment toModel() {
        return new Establishment(this.nome, this.cidade, this.endereco);
    }
}
