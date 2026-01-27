package com.monash.erp.oms.order.dto;

import java.math.BigDecimal;

public class PurchaseOrderReceiptDto {

    private String orderItemSeqId;
    private String receiptId;
    private String inventoryItemId;
    private BigDecimal quantityAccepted;

    public PurchaseOrderReceiptDto() {
    }

    public PurchaseOrderReceiptDto(String orderItemSeqId, String receiptId, String inventoryItemId, BigDecimal quantityAccepted) {
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

    public BigDecimal getQuantityAccepted() {
        return quantityAccepted;
    }

    public void setQuantityAccepted(BigDecimal quantityAccepted) {
        this.quantityAccepted = quantityAccepted;
    }
}
