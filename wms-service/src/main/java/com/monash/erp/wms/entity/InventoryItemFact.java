package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class InventoryItemFact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String inventoryItemId;
    private String facilityId;
    private String productDimId;
    private String origCurrencyDimId;
    private String inventoryDateDimId;
    private BigDecimal quantityOnHandTotal;
    private BigDecimal availableToPromiseTotal;
    private BigDecimal unitCost;
    private BigDecimal soldoutAmount;
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

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getProductDimId() {
        return productDimId;
    }

    public void setProductDimId(String productDimId) {
        this.productDimId = productDimId;
    }

    public String getOrigCurrencyDimId() {
        return origCurrencyDimId;
    }

    public void setOrigCurrencyDimId(String origCurrencyDimId) {
        this.origCurrencyDimId = origCurrencyDimId;
    }

    public String getInventoryDateDimId() {
        return inventoryDateDimId;
    }

    public void setInventoryDateDimId(String inventoryDateDimId) {
        this.inventoryDateDimId = inventoryDateDimId;
    }

    public BigDecimal getQuantityOnHandTotal() {
        return quantityOnHandTotal;
    }

    public void setQuantityOnHandTotal(BigDecimal quantityOnHandTotal) {
        this.quantityOnHandTotal = quantityOnHandTotal;
    }

    public BigDecimal getAvailableToPromiseTotal() {
        return availableToPromiseTotal;
    }

    public void setAvailableToPromiseTotal(BigDecimal availableToPromiseTotal) {
        this.availableToPromiseTotal = availableToPromiseTotal;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public BigDecimal getSoldoutAmount() {
        return soldoutAmount;
    }

    public void setSoldoutAmount(BigDecimal soldoutAmount) {
        this.soldoutAmount = soldoutAmount;
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