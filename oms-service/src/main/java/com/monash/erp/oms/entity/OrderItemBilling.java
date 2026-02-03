package com.monash.erp.oms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "order_item_billing",
        indexes = {
                @Index(name = "idx_order_item_billing_order_id", columnList = "order_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class OrderItemBilling extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemSeqId;
    private String invoiceId;
    private String invoiceItemSeqId;
    private String itemIssuanceId;
    private String shipmentReceiptId;
    private BigDecimal quantity;
    private BigDecimal amount;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
public void setInvoiceItemSeqId(String invoiceItemSeqId) {
        this.invoiceItemSeqId = invoiceItemSeqId;
    }
public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }
public void setShipmentReceiptId(String shipmentReceiptId) {
        this.shipmentReceiptId = shipmentReceiptId;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}
