package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class FinAccountAuth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String finAccountAuthId;

    private String finAccountId;

    private BigDecimal amount;

    private String currencyUomId;

    private LocalDateTime authorizationDate;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFinAccountAuthId() {
        return finAccountAuthId;
    }

    public void setFinAccountAuthId(String finAccountAuthId) {
        this.finAccountAuthId = finAccountAuthId;
    }

    public String getFinAccountId() {
        return finAccountId;
    }

    public void setFinAccountId(String finAccountId) {
        this.finAccountId = finAccountId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public LocalDateTime getAuthorizationDate() {
        return authorizationDate;
    }

    public void setAuthorizationDate(LocalDateTime authorizationDate) {
        this.authorizationDate = authorizationDate;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
}
