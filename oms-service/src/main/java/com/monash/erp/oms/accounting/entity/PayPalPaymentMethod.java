package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class PayPalPaymentMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentMethodId;

    private String payerId;

    private String expressCheckoutToken;

    private String payerStatus;

    private Boolean avsAddr;

    private Boolean avsZip;

    private String correlationId;

    private String contactMechId;

    private String transactionId;
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
public void setPayerId(String payerId) {
        this.payerId = payerId;
    }
public void setExpressCheckoutToken(String expressCheckoutToken) {
        this.expressCheckoutToken = expressCheckoutToken;
    }
public void setPayerStatus(String payerStatus) {
        this.payerStatus = payerStatus;
    }
public void setAvsAddr(Boolean avsAddr) {
        this.avsAddr = avsAddr;
    }
public void setAvsZip(Boolean avsZip) {
        this.avsZip = avsZip;
    }
public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
