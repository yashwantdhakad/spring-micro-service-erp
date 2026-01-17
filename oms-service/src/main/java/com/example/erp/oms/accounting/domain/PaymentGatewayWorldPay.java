package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class PaymentGatewayWorldPay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String paymentGatewayConfigId;

    private String redirectUrl;

    private String instId;

    private Boolean authMode;

    private Boolean fixContact;

    private Boolean hideContact;

    private Boolean hideCurrency;

    private String langId;

    private Boolean noLanguageMenu;

    private Boolean withDelivery;

    private BigDecimal testMode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentGatewayConfigId() {
        return paymentGatewayConfigId;
    }

    public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public Boolean getAuthMode() {
        return authMode;
    }

    public void setAuthMode(Boolean authMode) {
        this.authMode = authMode;
    }

    public Boolean getFixContact() {
        return fixContact;
    }

    public void setFixContact(Boolean fixContact) {
        this.fixContact = fixContact;
    }

    public Boolean getHideContact() {
        return hideContact;
    }

    public void setHideContact(Boolean hideContact) {
        this.hideContact = hideContact;
    }

    public Boolean getHideCurrency() {
        return hideCurrency;
    }

    public void setHideCurrency(Boolean hideCurrency) {
        this.hideCurrency = hideCurrency;
    }

    public String getLangId() {
        return langId;
    }

    public void setLangId(String langId) {
        this.langId = langId;
    }

    public Boolean getNoLanguageMenu() {
        return noLanguageMenu;
    }

    public void setNoLanguageMenu(Boolean noLanguageMenu) {
        this.noLanguageMenu = noLanguageMenu;
    }

    public Boolean getWithDelivery() {
        return withDelivery;
    }

    public void setWithDelivery(Boolean withDelivery) {
        this.withDelivery = withDelivery;
    }

    public BigDecimal getTestMode() {
        return testMode;
    }

    public void setTestMode(BigDecimal testMode) {
        this.testMode = testMode;
    }
}
