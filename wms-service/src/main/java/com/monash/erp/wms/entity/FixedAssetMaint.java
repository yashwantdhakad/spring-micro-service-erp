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
public class FixedAssetMaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fixedAssetId;
    private String maintHistSeqId;
    private String statusId;
    private String productMaintTypeId;
    private String productMaintSeqId;
    private String scheduleWorkEffortId;
    private BigDecimal intervalQuantity;
    private String intervalUomId;
    private String intervalMeterTypeId;
    private String purchaseOrderId;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String partyId;
    private LocalDateTime statusDateTime;
    private BigDecimal price;
    private BigDecimal quantity;
    private LocalDateTime categoryChangeStartDate;
    private LocalDateTime categoryChangeEndDate;
    private String reasonEnumId;
    private String inventoryItemId;
    private String receiptId;
    private String buildCost;
public void setId(Long id) {
        this.id = id;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setMaintHistSeqId(String maintHistSeqId) {
        this.maintHistSeqId = maintHistSeqId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setProductMaintTypeId(String productMaintTypeId) {
        this.productMaintTypeId = productMaintTypeId;
    }
public void setProductMaintSeqId(String productMaintSeqId) {
        this.productMaintSeqId = productMaintSeqId;
    }
public void setScheduleWorkEffortId(String scheduleWorkEffortId) {
        this.scheduleWorkEffortId = scheduleWorkEffortId;
    }
public void setIntervalQuantity(BigDecimal intervalQuantity) {
        this.intervalQuantity = intervalQuantity;
    }
public void setIntervalUomId(String intervalUomId) {
        this.intervalUomId = intervalUomId;
    }
public void setIntervalMeterTypeId(String intervalMeterTypeId) {
        this.intervalMeterTypeId = intervalMeterTypeId;
    }
public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
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
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setStatusDateTime(LocalDateTime statusDateTime) {
        this.statusDateTime = statusDateTime;
    }
public void setPrice(BigDecimal price) {
        this.price = price;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setCategoryChangeStartDate(LocalDateTime categoryChangeStartDate) {
        this.categoryChangeStartDate = categoryChangeStartDate;
    }
public void setCategoryChangeEndDate(LocalDateTime categoryChangeEndDate) {
        this.categoryChangeEndDate = categoryChangeEndDate;
    }
public void setReasonEnumId(String reasonEnumId) {
        this.reasonEnumId = reasonEnumId;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }
public void setBuildCost(String buildCost) {
        this.buildCost = buildCost;
    }

}
