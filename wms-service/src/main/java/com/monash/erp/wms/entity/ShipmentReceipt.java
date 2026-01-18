package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class ShipmentReceipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String receiptId;
    private String inventoryItemId;
    private String productId;
    private String shipmentId;
    private String shipmentItemSeqId;
    private String shipmentPackageSeqId;
    private String orderId;
    private String orderItemSeqId;
    private String returnId;
    private String returnItemSeqId;
    private String rejectionId;
    private String receivedByUserLoginId;
    private LocalDateTime datetimeReceived;
    private String itemDescription;
    private String quantityAccepted;
    private String quantityRejected;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
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

    public String getShipmentPackageSeqId() {
        return shipmentPackageSeqId;
    }

    public void setShipmentPackageSeqId(String shipmentPackageSeqId) {
        this.shipmentPackageSeqId = shipmentPackageSeqId;
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

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getReturnItemSeqId() {
        return returnItemSeqId;
    }

    public void setReturnItemSeqId(String returnItemSeqId) {
        this.returnItemSeqId = returnItemSeqId;
    }

    public String getRejectionId() {
        return rejectionId;
    }

    public void setRejectionId(String rejectionId) {
        this.rejectionId = rejectionId;
    }

    public String getReceivedByUserLoginId() {
        return receivedByUserLoginId;
    }

    public void setReceivedByUserLoginId(String receivedByUserLoginId) {
        this.receivedByUserLoginId = receivedByUserLoginId;
    }

    public LocalDateTime getDatetimeReceived() {
        return datetimeReceived;
    }

    public void setDatetimeReceived(LocalDateTime datetimeReceived) {
        this.datetimeReceived = datetimeReceived;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getQuantityAccepted() {
        return quantityAccepted;
    }

    public void setQuantityAccepted(String quantityAccepted) {
        this.quantityAccepted = quantityAccepted;
    }

    public String getQuantityRejected() {
        return quantityRejected;
    }

    public void setQuantityRejected(String quantityRejected) {
        this.quantityRejected = quantityRejected;
    }

}