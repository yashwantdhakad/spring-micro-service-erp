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
public class InventoryCountItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String inventoryCountId;
    private String inventoryCountItemSeqId;
    private String inventoryItemId;
    private String itemStatusId;
    private String locationSeqId;
    private String productId;
    private String productIdentifier;
    private BigDecimal quantity;
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
public void setItemStatusId(String itemStatusId) {
        this.itemStatusId = itemStatusId;
    }
public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
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
