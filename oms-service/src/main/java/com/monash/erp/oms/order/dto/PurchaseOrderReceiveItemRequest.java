package com.monash.erp.oms.order.dto;

import java.math.BigDecimal;

public class PurchaseOrderReceiveItemRequest {

    private String orderItemSeqId;
    private BigDecimal quantity;
    private String locationSeqId;

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getLocationSeqId() {
        return locationSeqId;
    }

    public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }
}
