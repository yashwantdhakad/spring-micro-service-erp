package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class OrderWorkEffortAppl extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemSeqId;
    private String workEffortId;
    private String workEffortSeqId;
    private String statusId;
    private BigDecimal quantity;
    private String serialNumber;
    private String orderWorkEfftApplTypeId;
    private BigDecimal assignedQuantity;

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

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getWorkEffortSeqId() {
        return workEffortSeqId;
    }

    public void setWorkEffortSeqId(String workEffortSeqId) {
        this.workEffortSeqId = workEffortSeqId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }




    public String getOrderWorkEfftApplTypeId() {
        return orderWorkEfftApplTypeId;
    }

    public void setOrderWorkEfftApplTypeId(String orderWorkEfftApplTypeId) {
        this.orderWorkEfftApplTypeId = orderWorkEfftApplTypeId;
    }

    public BigDecimal getAssignedQuantity() {
        return assignedQuantity;
    }

    public void setAssignedQuantity(BigDecimal assignedQuantity) {
        this.assignedQuantity = assignedQuantity;
    }

}