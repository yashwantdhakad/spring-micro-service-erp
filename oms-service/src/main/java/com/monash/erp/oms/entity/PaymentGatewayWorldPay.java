package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class PaymentGatewayWorldPay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentGatewayConfigId;
    private String redirectUrl;
    private String instId;
    private String authMode;
    private String fixContact;
    private String hideContact;
    private String hideCurrency;
    private String langId;
    private String noLanguageMenu;
    private String withDelivery;
    private BigDecimal testMode;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;

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

    public String getAuthMode() {
        return authMode;
    }

    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    public String getFixContact() {
        return fixContact;
    }

    public void setFixContact(String fixContact) {
        this.fixContact = fixContact;
    }

    public String getHideContact() {
        return hideContact;
    }

    public void setHideContact(String hideContact) {
        this.hideContact = hideContact;
    }

    public String getHideCurrency() {
        return hideCurrency;
    }

    public void setHideCurrency(String hideCurrency) {
        this.hideCurrency = hideCurrency;
    }

    public String getLangId() {
        return langId;
    }

    public void setLangId(String langId) {
        this.langId = langId;
    }

    public String getNoLanguageMenu() {
        return noLanguageMenu;
    }

    public void setNoLanguageMenu(String noLanguageMenu) {
        this.noLanguageMenu = noLanguageMenu;
    }

    public String getWithDelivery() {
        return withDelivery;
    }

    public void setWithDelivery(String withDelivery) {
        this.withDelivery = withDelivery;
    }

    public BigDecimal getTestMode() {
        return testMode;
    }

    public void setTestMode(BigDecimal testMode) {
        this.testMode = testMode;
    }

    public LocalDateTime getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public LocalDateTime getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public LocalDateTime getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }

    public LocalDateTime getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}