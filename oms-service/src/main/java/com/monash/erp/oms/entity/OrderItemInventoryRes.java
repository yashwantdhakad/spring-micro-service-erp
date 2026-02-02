package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class OrderItemInventoryRes extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemSeqId;
    private String inventoryItemId;
    private String reserveOrderEnumId;
    private BigDecimal quantity;
    private BigDecimal quantityNotAvailable;
    private LocalDateTime reservedDatetime;
    private LocalDateTime createdDatetime;
    private LocalDateTime promisedDatetime;
    private LocalDateTime currentPromisedDate;
    private LocalDateTime pickStartDate;

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

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getReserveOrderEnumId() {
        return reserveOrderEnumId;
    }

    public void setReserveOrderEnumId(String reserveOrderEnumId) {
        this.reserveOrderEnumId = reserveOrderEnumId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getQuantityNotAvailable() {
        return quantityNotAvailable;
    }

    public void setQuantityNotAvailable(BigDecimal quantityNotAvailable) {
        this.quantityNotAvailable = quantityNotAvailable;
    }

    public LocalDateTime getReservedDatetime() {
        return reservedDatetime;
    }

    public void setReservedDatetime(LocalDateTime reservedDatetime) {
        this.reservedDatetime = reservedDatetime;
    }

    public LocalDateTime getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(LocalDateTime createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public LocalDateTime getPromisedDatetime() {
        return promisedDatetime;
    }

    public void setPromisedDatetime(LocalDateTime promisedDatetime) {
        this.promisedDatetime = promisedDatetime;
    }

    public LocalDateTime getCurrentPromisedDate() {
        return currentPromisedDate;
    }

    public void setCurrentPromisedDate(LocalDateTime currentPromisedDate) {
        this.currentPromisedDate = currentPromisedDate;
    }

    public LocalDateTime getPickStartDate() {
        return pickStartDate;
    }

    public void setPickStartDate(LocalDateTime pickStartDate) {
        this.pickStartDate = pickStartDate;
    }




}