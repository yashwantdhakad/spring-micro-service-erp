package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setInventoryCountId(String inventoryCountId) {
        this.inventoryCountId = inventoryCountId;
    }
public void setInventoryCountItemSeqId(String inventoryCountItemSeqId) {
        this.inventoryCountItemSeqId = inventoryCountItemSeqId;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }
public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }
public void setSystemQuantityOnHand(BigDecimal systemQuantityOnHand) {
        this.systemQuantityOnHand = systemQuantityOnHand;
    }
public void setActualQuantityOnHand(BigDecimal actualQuantityOnHand) {
        this.actualQuantityOnHand = actualQuantityOnHand;
    }
public void setVarianceQuantityOnHand(BigDecimal varianceQuantityOnHand) {
        this.varianceQuantityOnHand = varianceQuantityOnHand;
    }
public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }
public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }
public void setActualCost(BigDecimal actualCost) {
        this.actualCost = actualCost;
    }
public void setCostVariance(BigDecimal costVariance) {
        this.costVariance = costVariance;
    }
public void setActualValue(BigDecimal actualValue) {
        this.actualValue = actualValue;
    }
public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }
public void setValueVariance(BigDecimal valueVariance) {
        this.valueVariance = valueVariance;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}
