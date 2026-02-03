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
public class OrderAdjustmentBilling extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderAdjustmentId;
    private String invoiceId;
    private String invoiceItemSeqId;
    private BigDecimal amount;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderAdjustmentId(String orderAdjustmentId) {
        this.orderAdjustmentId = orderAdjustmentId;
    }
public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
public void setInvoiceItemSeqId(String invoiceItemSeqId) {
        this.invoiceItemSeqId = invoiceItemSeqId;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}
