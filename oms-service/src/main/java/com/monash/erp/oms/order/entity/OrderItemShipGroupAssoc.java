package com.monash.erp.oms.order.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

import com.monash.erp.oms.entity.AuditableEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "order_item_ship_group_assoc",
        indexes = {
                @Index(name = "idx_order_item_ship_group_assoc_order_id", columnList = "order_id"),
                @Index(name = "idx_order_item_ship_group_assoc_order_ship_group", columnList = "order_id, ship_group_seq_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class OrderItemShipGroupAssoc extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemSeqId;
    private String shipGroupSeqId;
    private BigDecimal quantity;
    private BigDecimal cancelQuantity;
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
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setCancelQuantity(BigDecimal cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }

}
