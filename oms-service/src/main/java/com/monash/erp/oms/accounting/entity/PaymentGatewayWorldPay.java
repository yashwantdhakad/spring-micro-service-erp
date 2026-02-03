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
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }
public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
public void setInstId(String instId) {
        this.instId = instId;
    }
public void setAuthMode(Boolean authMode) {
        this.authMode = authMode;
    }
public void setFixContact(Boolean fixContact) {
        this.fixContact = fixContact;
    }
public void setHideContact(Boolean hideContact) {
        this.hideContact = hideContact;
    }
public void setHideCurrency(Boolean hideCurrency) {
        this.hideCurrency = hideCurrency;
    }
public void setLangId(String langId) {
        this.langId = langId;
    }
public void setNoLanguageMenu(Boolean noLanguageMenu) {
        this.noLanguageMenu = noLanguageMenu;
    }
public void setWithDelivery(Boolean withDelivery) {
        this.withDelivery = withDelivery;
    }
public void setTestMode(BigDecimal testMode) {
        this.testMode = testMode;
    }
}
