package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class InventoryCountVariance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String inventoryCountId;
    private String inventoryCountItemSeqId;
    private String inventoryItemId;
    private String productId;
    private String productIdentifier;
    private String locationSeqId;
    private BigDecimal systemQuantityOnHand;
    private BigDecimal actualQuantityOnHand;
    private BigDecimal varianceQuantityOnHand;
    private BigDecimal unitCost;
    private BigDecimal totalCost;
    private BigDecimal actualCost;
    private BigDecimal costVariance;
    private BigDecimal actualValue;
    private BigDecimal totalValue;
    private BigDecimal valueVariance;
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

    public String getInventoryCountId() {
        return inventoryCountId;
    }

    public void setInventoryCountId(String inventoryCountId) {
        this.inventoryCountId = inventoryCountId;
    }

    public String getInventoryCountItemSeqId() {
        return inventoryCountItemSeqId;
    }

    public void setInventoryCountItemSeqId(String inventoryCountItemSeqId) {
        this.inventoryCountItemSeqId = inventoryCountItemSeqId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductIdentifier() {
        return productIdentifier;
    }

    public void setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

    public String getLocationSeqId() {
        return locationSeqId;
    }

    public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }

    public BigDecimal getSystemQuantityOnHand() {
        return systemQuantityOnHand;
    }

    public void setSystemQuantityOnHand(BigDecimal systemQuantityOnHand) {
        this.systemQuantityOnHand = systemQuantityOnHand;
    }

    public BigDecimal getActualQuantityOnHand() {
        return actualQuantityOnHand;
    }

    public void setActualQuantityOnHand(BigDecimal actualQuantityOnHand) {
        this.actualQuantityOnHand = actualQuantityOnHand;
    }

    public BigDecimal getVarianceQuantityOnHand() {
        return varianceQuantityOnHand;
    }

    public void setVarianceQuantityOnHand(BigDecimal varianceQuantityOnHand) {
        this.varianceQuantityOnHand = varianceQuantityOnHand;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public BigDecimal getActualCost() {
        return actualCost;
    }

    public void setActualCost(BigDecimal actualCost) {
        this.actualCost = actualCost;
    }

    public BigDecimal getCostVariance() {
        return costVariance;
    }

    public void setCostVariance(BigDecimal costVariance) {
        this.costVariance = costVariance;
    }

    public BigDecimal getActualValue() {
        return actualValue;
    }

    public void setActualValue(BigDecimal actualValue) {
        this.actualValue = actualValue;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    public BigDecimal getValueVariance() {
        return valueVariance;
    }

    public void setValueVariance(BigDecimal valueVariance) {
        this.valueVariance = valueVariance;
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