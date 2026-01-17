package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getExpressCheckoutToken() {
        return expressCheckoutToken;
    }

    public void setExpressCheckoutToken(String expressCheckoutToken) {
        this.expressCheckoutToken = expressCheckoutToken;
    }

    public String getPayerStatus() {
        return payerStatus;
    }

    public void setPayerStatus(String payerStatus) {
        this.payerStatus = payerStatus;
    }

    public Boolean getAvsAddr() {
        return avsAddr;
    }

    public void setAvsAddr(Boolean avsAddr) {
        this.avsAddr = avsAddr;
    }

    public Boolean getAvsZip() {
        return avsZip;
    }

    public void setAvsZip(Boolean avsZip) {
        this.avsZip = avsZip;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
