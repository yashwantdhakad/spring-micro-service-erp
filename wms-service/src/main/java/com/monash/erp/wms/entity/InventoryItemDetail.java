package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "inventory_item_detail",
        indexes = {
                @Index(name = "idx_inventory_item_detail_inventory_item_id", columnList = "inventory_item_id"),
                @Index(name = "idx_inventory_item_detail_work_effort_id", columnList = "work_effort_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class InventoryItemDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String inventoryItemId;
    private String inventoryItemDetailSeqId;
    private LocalDateTime effectiveDate;
    private String quantityOnHandDiff;
    private String availableToPromiseDiff;
    private String accountingQuantityDiff;
    private String unitCost;
    private String orderId;
    private String orderItemSeqId;
    private String shipGroupSeqId;
    private String shipmentId;
    private String shipmentItemSeqId;
    private String returnId;
    private String returnItemSeqId;
    private String workEffortId;
    private String fixedAssetId;
    private String maintHistSeqId;
    private String itemIssuanceId;
    private String receiptId;
    private String physicalInventoryId;
    private String reasonEnumId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setInventoryItemDetailSeqId(String inventoryItemDetailSeqId) {
        this.inventoryItemDetailSeqId = inventoryItemDetailSeqId;
    }
public void setEffectiveDate(LocalDateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
public void setQuantityOnHandDiff(String quantityOnHandDiff) {
        this.quantityOnHandDiff = quantityOnHandDiff;
    }
public void setAvailableToPromiseDiff(String availableToPromiseDiff) {
        this.availableToPromiseDiff = availableToPromiseDiff;
    }
public void setAccountingQuantityDiff(String accountingQuantityDiff) {
        this.accountingQuantityDiff = accountingQuantityDiff;
    }
public void setUnitCost(String unitCost) {
        this.unitCost = unitCost;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }
public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId;
    }
public void setReturnId(String returnId) {
        this.returnId = returnId;
    }
public void setReturnItemSeqId(String returnItemSeqId) {
        this.returnItemSeqId = returnItemSeqId;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setMaintHistSeqId(String maintHistSeqId) {
        this.maintHistSeqId = maintHistSeqId;
    }
public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }
public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }
public void setPhysicalInventoryId(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }
public void setReasonEnumId(String reasonEnumId) {
        this.reasonEnumId = reasonEnumId;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
