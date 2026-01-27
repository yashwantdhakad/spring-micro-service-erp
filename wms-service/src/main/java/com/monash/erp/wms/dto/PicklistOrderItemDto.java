package com.monash.erp.wms.dto;

import java.math.BigDecimal;

public class PicklistOrderItemDto {

    private String orderItemSeqId;
    private String inventoryItemId;
    private String itemStatusId;
    private BigDecimal quantity;

    public PicklistOrderItemDto() {
    }

    public PicklistOrderItemDto(
            String orderItemSeqId,
            String inventoryItemId,
            String itemStatusId,
            BigDecimal quantity
    ) {
        this.orderItemSeqId = orderItemSeqId;
        this.inventoryItemId = inventoryItemId;
        this.itemStatusId = itemStatusId;
        this.quantity = quantity;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getItemStatusId() {
        return itemStatusId;
    }

    public void setItemStatusId(String itemStatusId) {
        this.itemStatusId = itemStatusId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
}
