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
public class OrderItemAssoc extends AuditableEntity {

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
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }
public void setToOrderId(String toOrderId) {
        this.toOrderId = toOrderId;
    }
public void setToOrderItemSeqId(String toOrderItemSeqId) {
        this.toOrderItemSeqId = toOrderItemSeqId;
    }
public void setToShipGroupSeqId(String toShipGroupSeqId) {
        this.toShipGroupSeqId = toShipGroupSeqId;
    }
public void setOrderItemAssocTypeId(String orderItemAssocTypeId) {
        this.orderItemAssocTypeId = orderItemAssocTypeId;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

}
