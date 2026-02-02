package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class QuoteCoefficient extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String quoteId;
    private String coeffName;
    private BigDecimal coeffValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getCoeffName() {
        return coeffName;
    }

    public void setCoeffName(String coeffName) {
        this.coeffName = coeffName;
    }

    public BigDecimal getCoeffValue() {
        return coeffValue;
    }

    public void setCoeffValue(BigDecimal coeffValue) {
        this.coeffValue = coeffValue;
    }




}