package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class OrderItemChange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderItemChangeId;
    private String orderId;
    private String orderItemSeqId;
    private String changeTypeEnumId;
    private LocalDateTime changeDatetime;
    private String changeUserLogin;
    private BigDecimal quantity;
    private BigDecimal cancelQuantity;
    private BigDecimal unitPrice;
    private String itemDescription;
    private String reasonEnumId;
    private String changeComments;
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

    public String getOrderItemChangeId() {
        return orderItemChangeId;
    }

    public void setOrderItemChangeId(String orderItemChangeId) {
        this.orderItemChangeId = orderItemChangeId;
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

    public String getChangeTypeEnumId() {
        return changeTypeEnumId;
    }

    public void setChangeTypeEnumId(String changeTypeEnumId) {
        this.changeTypeEnumId = changeTypeEnumId;
    }

    public LocalDateTime getChangeDatetime() {
        return changeDatetime;
    }

    public void setChangeDatetime(LocalDateTime changeDatetime) {
        this.changeDatetime = changeDatetime;
    }

    public String getChangeUserLogin() {
        return changeUserLogin;
    }

    public void setChangeUserLogin(String changeUserLogin) {
        this.changeUserLogin = changeUserLogin;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getCancelQuantity() {
        return cancelQuantity;
    }

    public void setCancelQuantity(BigDecimal cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getReasonEnumId() {
        return reasonEnumId;
    }

    public void setReasonEnumId(String reasonEnumId) {
        this.reasonEnumId = reasonEnumId;
    }

    public String getChangeComments() {
        return changeComments;
    }

    public void setChangeComments(String changeComments) {
        this.changeComments = changeComments;
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