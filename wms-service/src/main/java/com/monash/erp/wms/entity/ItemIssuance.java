package com.monash.erp.wms.entity;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemIssuanceId() {
        return itemIssuanceId;
    }

    public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentItemSeqId() {
        return shipmentItemSeqId;
    }

    public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId;
    }

    public String getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public String getMaintHistSeqId() {
        return maintHistSeqId;
    }

    public void setMaintHistSeqId(String maintHistSeqId) {
        this.maintHistSeqId = maintHistSeqId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public LocalDateTime getIssuedDateTime() {
        return issuedDateTime;
    }

    public void setIssuedDateTime(LocalDateTime issuedDateTime) {
        this.issuedDateTime = issuedDateTime;
    }

    public String getIssuedByUserLoginId() {
        return issuedByUserLoginId;
    }

    public void setIssuedByUserLoginId(String issuedByUserLoginId) {
        this.issuedByUserLoginId = issuedByUserLoginId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCancelQuantity() {
        return cancelQuantity;
    }

    public void setCancelQuantity(String cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }

    public String getIssuanceTypeId() {
        return issuanceTypeId;
    }

    public void setIssuanceTypeId(String issuanceTypeId) {
        this.issuanceTypeId = issuanceTypeId;
    }

    public String getCurrentStatusId() {
        return currentStatusId;
    }

    public void setCurrentStatusId(String currentStatusId) {
        this.currentStatusId = currentStatusId;
    }

    public LocalDateTime getCancelledDateTime() {
        return cancelledDateTime;
    }

    public void setCancelledDateTime(LocalDateTime cancelledDateTime) {
        this.cancelledDateTime = cancelledDateTime;
    }

    public String getCancelledByUserLoginId() {
        return cancelledByUserLoginId;
    }

    public void setCancelledByUserLoginId(String cancelledByUserLoginId) {
        this.cancelledByUserLoginId = cancelledByUserLoginId;
    }

    public String getTransferQuantity() {
        return transferQuantity;
    }

    public void setTransferQuantity(String transferQuantity) {
        this.transferQuantity = transferQuantity;
    }

    public String getReturnedExcessIssuedQty() {
        return returnedExcessIssuedQty;
    }

    public void setReturnedExcessIssuedQty(String returnedExcessIssuedQty) {
        this.returnedExcessIssuedQty = returnedExcessIssuedQty;
    }

    public String getWegsReferenceNumber() {
        return wegsReferenceNumber;
    }

    public void setWegsReferenceNumber(String wegsReferenceNumber) {
        this.wegsReferenceNumber = wegsReferenceNumber;
    }

    public String getLocationSeqId() {
        return locationSeqId;
    }

    public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }

    public String getDeliveredToParty() {
        return deliveredToParty;
    }

    public void setDeliveredToParty(String deliveredToParty) {
        this.deliveredToParty = deliveredToParty;
    }

}
