package com.monash.erp.oms.accounting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PaymentGatewayEway {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String paymentGatewayConfigId;

    private String customerId;

    private String refundPwd;

    private String testMode;

    private String enableCvn;

    private String enableBeagle;

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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getRefundPwd() {
        return refundPwd;
    }

    public void setRefundPwd(String refundPwd) {
        this.refundPwd = refundPwd;
    }

    public String getTestMode() {
        return testMode;
    }

    public void setTestMode(String testMode) {
        this.testMode = testMode;
    }

    public String getEnableCvn() {
        return enableCvn;
    }

    public void setEnableCvn(String enableCvn) {
        this.enableCvn = enableCvn;
    }

    public String getEnableBeagle() {
        return enableBeagle;
    }

    public void setEnableBeagle(String enableBeagle) {
        this.enableBeagle = enableBeagle;
    }
}
