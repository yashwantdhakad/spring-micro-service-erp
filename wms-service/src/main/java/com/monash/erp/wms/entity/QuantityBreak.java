package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class QuantityBreak {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String quantityBreakId;
    private String quantityBreakTypeId;
    private BigDecimal fromQuantity;
    private BigDecimal thruQuantity;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuantityBreakId() {
        return quantityBreakId;
    }

    public void setQuantityBreakId(String quantityBreakId) {
        this.quantityBreakId = quantityBreakId;
    }

    public String getQuantityBreakTypeId() {
        return quantityBreakTypeId;
    }

    public void setQuantityBreakTypeId(String quantityBreakTypeId) {
        this.quantityBreakTypeId = quantityBreakTypeId;
    }

    public BigDecimal getFromQuantity() {
        return fromQuantity;
    }

    public void setFromQuantity(BigDecimal fromQuantity) {
        this.fromQuantity = fromQuantity;
    }

    public BigDecimal getThruQuantity() {
        return thruQuantity;
    }

    public void setThruQuantity(BigDecimal thruQuantity) {
        this.thruQuantity = thruQuantity;
    }

    public LocalDateTime getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public LocalDateTime getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public LocalDateTime getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }

    public LocalDateTime getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}