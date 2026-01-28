package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class OrderItemAssoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemSeqId;
    private String shipGroupSeqId;
    private String toOrderId;
    private String toOrderItemSeqId;
    private String toShipGroupSeqId;
    private String orderItemAssocTypeId;
    private BigDecimal quantity;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getToOrderId() {
        return toOrderId;
    }

    public void setToOrderId(String toOrderId) {
        this.toOrderId = toOrderId;
    }

    public String getToOrderItemSeqId() {
        return toOrderItemSeqId;
    }

    public void setToOrderItemSeqId(String toOrderItemSeqId) {
        this.toOrderItemSeqId = toOrderItemSeqId;
    }

    public String getToShipGroupSeqId() {
        return toShipGroupSeqId;
    }

    public void setToShipGroupSeqId(String toShipGroupSeqId) {
        this.toShipGroupSeqId = toShipGroupSeqId;
    }

    public String getOrderItemAssocTypeId() {
        return orderItemAssocTypeId;
    }

    public void setOrderItemAssocTypeId(String orderItemAssocTypeId) {
        this.orderItemAssocTypeId = orderItemAssocTypeId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public LocalDateTime getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public LocalDateTime getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }

    public LocalDateTime getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}