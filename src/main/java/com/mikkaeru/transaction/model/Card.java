package com.mikkaeru.transaction.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String cardCode;

    /**
     * @deprecated Hibernate only
     */
    public Card() { }

    public Card(String email, String cardCode) {
        this.email = email;
        this.cardCode = cardCode;
    }
}
