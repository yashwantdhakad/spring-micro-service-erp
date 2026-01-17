package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class FixedAssetStdCost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fixedAssetId;

    private String fixedAssetStdCostTypeId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private String amountUomId;

    private BigDecimal amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public String getFixedAssetStdCostTypeId() {
        return fixedAssetStdCostTypeId;
    }

    public void setFixedAssetStdCostTypeId(String fixedAssetStdCostTypeId) {
        this.fixedAssetStdCostTypeId = fixedAssetStdCostTypeId;
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

    public String getAmountUomId() {
        return amountUomId;
    }

    public void setAmountUomId(String amountUomId) {
        this.amountUomId = amountUomId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
