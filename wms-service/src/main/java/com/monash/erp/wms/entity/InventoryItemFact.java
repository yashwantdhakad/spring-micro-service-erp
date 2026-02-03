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
public void setId(Long id) {
        this.id = id;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setProductDimId(String productDimId) {
        this.productDimId = productDimId;
    }
public void setOrigCurrencyDimId(String origCurrencyDimId) {
        this.origCurrencyDimId = origCurrencyDimId;
    }
public void setInventoryDateDimId(String inventoryDateDimId) {
        this.inventoryDateDimId = inventoryDateDimId;
    }
public void setQuantityOnHandTotal(BigDecimal quantityOnHandTotal) {
        this.quantityOnHandTotal = quantityOnHandTotal;
    }
public void setAvailableToPromiseTotal(BigDecimal availableToPromiseTotal) {
        this.availableToPromiseTotal = availableToPromiseTotal;
    }
public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }
public void setSoldoutAmount(BigDecimal soldoutAmount) {
        this.soldoutAmount = soldoutAmount;
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
