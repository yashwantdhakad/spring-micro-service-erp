package com.monash.erp.oms.accounting.entity;

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
public class FinAccountTrans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String finAccountTransId;

    private String finAccountTransTypeId;

    private String finAccountId;

    private String partyId;

    private String glReconciliationId;

    private LocalDateTime transactionDate;

    private LocalDateTime entryDate;

    private BigDecimal amount;

    private String paymentId;

    private String orderId;

    private String orderItemSeqId;

    private String performedByPartyId;

    private String reasonEnumId;

    private String comments;

    private String statusId;
public void setId(Long id) {
        this.id = id;
    }
public void setFinAccountTransId(String finAccountTransId) {
        this.finAccountTransId = finAccountTransId;
    }
public void setFinAccountTransTypeId(String finAccountTransTypeId) {
        this.finAccountTransTypeId = finAccountTransTypeId;
    }
public void setFinAccountId(String finAccountId) {
        this.finAccountId = finAccountId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setGlReconciliationId(String glReconciliationId) {
        this.glReconciliationId = glReconciliationId;
    }
public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setPerformedByPartyId(String performedByPartyId) {
        this.performedByPartyId = performedByPartyId;
    }
public void setReasonEnumId(String reasonEnumId) {
        this.reasonEnumId = reasonEnumId;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
}
