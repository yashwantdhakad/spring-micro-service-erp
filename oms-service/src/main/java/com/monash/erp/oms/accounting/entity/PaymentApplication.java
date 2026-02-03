package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class PaymentApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentApplicationId;

    private String paymentId;

    private String invoiceId;

    private String invoiceItemSeqId;

    private String billingAccountId;

    private String overrideGlAccountId;

    private String toPaymentId;

    private String taxAuthGeoId;

    private BigDecimal amountApplied;
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentApplicationId(String paymentApplicationId) {
        this.paymentApplicationId = paymentApplicationId;
    }
public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
public void setInvoiceItemSeqId(String invoiceItemSeqId) {
        this.invoiceItemSeqId = invoiceItemSeqId;
    }
public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }
public void setOverrideGlAccountId(String overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }
public void setToPaymentId(String toPaymentId) {
        this.toPaymentId = toPaymentId;
    }
public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }
public void setAmountApplied(BigDecimal amountApplied) {
        this.amountApplied = amountApplied;
    }
}
