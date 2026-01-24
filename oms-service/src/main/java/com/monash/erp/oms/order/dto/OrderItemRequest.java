package com.monash.erp.oms.order.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderItemRequest {

    private String orderId;
    private String orderPartSeqId;
    private String productId;
    private BigDecimal quantity;
    private BigDecimal unitAmount;
    private String itemDescription;
    private LocalDateTime requiredByDate;
    private String itemTypeEnumId;
    private LocalDateTime shipBeforeDate;
    private LocalDateTime estimatedDeliveryDate;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderPartSeqId() {
        return orderPartSeqId;
    }

    public void setOrderPartSeqId(String orderPartSeqId) {
        this.orderPartSeqId = orderPartSeqId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(BigDecimal unitAmount) {
        this.unitAmount = unitAmount;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public LocalDateTime getRequiredByDate() {
        return requiredByDate;
    }

    public void setRequiredByDate(LocalDateTime requiredByDate) {
        this.requiredByDate = requiredByDate;
    }

    public String getItemTypeEnumId() {
        return itemTypeEnumId;
    }

    public void setItemTypeEnumId(String itemTypeEnumId) {
        this.itemTypeEnumId = itemTypeEnumId;
    }

    public LocalDateTime getShipBeforeDate() {
        return shipBeforeDate;
    }

    public void setShipBeforeDate(LocalDateTime shipBeforeDate) {
        this.shipBeforeDate = shipBeforeDate;
    }

    public LocalDateTime getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }
}
