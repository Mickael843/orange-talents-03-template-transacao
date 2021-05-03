package com.mikkaeru.transaction.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mikkaeru.transaction.model.Establishment;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@JsonInclude(NON_NULL)
public class EstablishmentResponse {

    @JsonProperty
    private String name;
    @JsonProperty
    private String city;
    @JsonProperty
    private String address;

    public EstablishmentResponse(Establishment establishment) {
        this.name = establishment.getName();
        this.city = establishment.getCity();
        this.address = establishment.getAddress();
    }
}
