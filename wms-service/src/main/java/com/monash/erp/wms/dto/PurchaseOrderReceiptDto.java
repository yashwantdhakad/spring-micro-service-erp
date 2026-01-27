package com.monash.erp.wms.dto;

public class PurchaseOrderReceiptDto {

    private String orderItemSeqId;
    private String receiptId;
    private String inventoryItemId;
    private String quantityAccepted;

    public PurchaseOrderReceiptDto() {
    }

    public PurchaseOrderReceiptDto(String orderItemSeqId, String receiptId, String inventoryItemId, String quantityAccepted) {
        this.orderItemSeqId = orderItemSeqId;
        this.receiptId = receiptId;
        this.inventoryItemId = inventoryItemId;
        this.quantityAccepted = quantityAccepted;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
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

    public String getQuantityAccepted() {
        return quantityAccepted;
    }

    public void setQuantityAccepted(String quantityAccepted) {
        this.quantityAccepted = quantityAccepted;
    }
}
