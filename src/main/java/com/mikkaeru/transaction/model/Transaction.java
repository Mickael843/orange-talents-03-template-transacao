package com.mikkaeru.transaction.model;

import javax.persistence.*;
import java.math.BigDecimal;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @OneToOne(optional = false, cascade = PERSIST)
    private Card card;
    @Column(nullable = false)
    private BigDecimal value;
    @Column(nullable = false)
    private String transactionId;
    @OneToOne(optional = false, cascade = PERSIST)
    private Establishment establishment;

    /**
     * @deprecated Hibernate only
     */
    public Transaction() { }

    public Transaction(Card card, BigDecimal value, String transactionId, Establishment establishment) {
        this.card = card;
        this.value = value;
        this.transactionId = transactionId;
        this.establishment = establishment;
    }
}
