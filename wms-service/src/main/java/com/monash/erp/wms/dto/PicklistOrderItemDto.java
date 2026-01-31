package com.monash.erp.wms.dto;

import java.math.BigDecimal;

public class PicklistOrderItemDto {

    private String orderItemSeqId;
    private String inventoryItemId;
    private String itemStatusId;
    private BigDecimal quantity;
    private String productId;
    private String productName;
    private String location;
    private String lotId;

    public PicklistOrderItemDto() {
    }

    public PicklistOrderItemDto(
            String orderItemSeqId,
            String inventoryItemId,
            String itemStatusId,
            BigDecimal quantity,
            String productId,
            String productName,
            String location,
            String lotId
    ) {
        this.orderItemSeqId = orderItemSeqId;
        this.inventoryItemId = inventoryItemId;
        this.itemStatusId = itemStatusId;
        this.quantity = quantity;
        this.productId = productId;
        this.productName = productName;
        this.location = location;
        this.lotId = lotId;
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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId;
    }
}
