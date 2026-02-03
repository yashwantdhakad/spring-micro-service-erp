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
        name = "item_issuance",
        indexes = {
                @Index(name = "idx_item_issuance_order_id", columnList = "order_id"),
                @Index(name = "idx_item_issuance_inventory_item_id", columnList = "inventory_item_id"),
                @Index(name = "idx_item_issuance_shipment_id", columnList = "shipment_id"),
                @Index(name = "idx_item_issuance_work_effort_id", columnList = "work_effort_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class ItemIssuance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemIssuanceId;
    private String orderId;
    private String orderItemSeqId;
    private String shipGroupSeqId;
    private String inventoryItemId;
    private String shipmentId;
    private String shipmentItemSeqId;
    private String fixedAssetId;
    private String maintHistSeqId;
    private String workEffortId;
    private LocalDateTime issuedDateTime;
    private String issuedByUserLoginId;
    private String quantity;
    private String cancelQuantity;
    private String issuanceTypeId;
    private String currentStatusId;
    private LocalDateTime cancelledDateTime;
    private String cancelledByUserLoginId;
    private String transferQuantity;
    private String returnedExcessIssuedQty;
    private String wegsReferenceNumber;
    private String locationSeqId;
    private String deliveredToParty;
public void setId(Long id) {
        this.id = id;
    }
public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
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
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setMaintHistSeqId(String maintHistSeqId) {
        this.maintHistSeqId = maintHistSeqId;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setIssuedDateTime(LocalDateTime issuedDateTime) {
        this.issuedDateTime = issuedDateTime;
    }
public void setIssuedByUserLoginId(String issuedByUserLoginId) {
        this.issuedByUserLoginId = issuedByUserLoginId;
    }
public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
public void setCancelQuantity(String cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }
public void setIssuanceTypeId(String issuanceTypeId) {
        this.issuanceTypeId = issuanceTypeId;
    }
public void setCurrentStatusId(String currentStatusId) {
        this.currentStatusId = currentStatusId;
    }
public void setCancelledDateTime(LocalDateTime cancelledDateTime) {
        this.cancelledDateTime = cancelledDateTime;
    }
public void setCancelledByUserLoginId(String cancelledByUserLoginId) {
        this.cancelledByUserLoginId = cancelledByUserLoginId;
    }
public void setTransferQuantity(String transferQuantity) {
        this.transferQuantity = transferQuantity;
    }
public void setReturnedExcessIssuedQty(String returnedExcessIssuedQty) {
        this.returnedExcessIssuedQty = returnedExcessIssuedQty;
    }
public void setWegsReferenceNumber(String wegsReferenceNumber) {
        this.wegsReferenceNumber = wegsReferenceNumber;
    }
public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }
public void setDeliveredToParty(String deliveredToParty) {
        this.deliveredToParty = deliveredToParty;
    }

}
