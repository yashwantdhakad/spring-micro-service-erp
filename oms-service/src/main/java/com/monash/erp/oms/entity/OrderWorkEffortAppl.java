package com.monash.erp.oms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setWorkEffortSeqId(String workEffortSeqId) {
        this.workEffortSeqId = workEffortSeqId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
public void setOrderWorkEfftApplTypeId(String orderWorkEfftApplTypeId) {
        this.orderWorkEfftApplTypeId = orderWorkEfftApplTypeId;
    }
public void setAssignedQuantity(BigDecimal assignedQuantity) {
        this.assignedQuantity = assignedQuantity;
    }

}
