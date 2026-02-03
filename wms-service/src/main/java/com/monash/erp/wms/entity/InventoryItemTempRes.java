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
public class InventoryItemTempRes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String visitId;
    private String productId;
    private String productStoreId;
    private BigDecimal quantity;
    private LocalDateTime reservedDate;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setReservedDate(LocalDateTime reservedDate) {
        this.reservedDate = reservedDate;
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
