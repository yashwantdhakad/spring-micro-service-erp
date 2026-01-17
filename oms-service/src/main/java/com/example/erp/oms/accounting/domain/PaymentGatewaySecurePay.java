package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class PaymentGatewaySecurePay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String paymentGatewayConfigId;

    private String merchantId;

    private String pwd;

    private String serverURL;

    private BigDecimal processTimeout;

    private Boolean enableAmountRound;

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

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getServerURL() {
        return serverURL;
    }

    public void setServerURL(String serverURL) {
        this.serverURL = serverURL;
    }

    public BigDecimal getProcessTimeout() {
        return processTimeout;
    }

    public void setProcessTimeout(BigDecimal processTimeout) {
        this.processTimeout = processTimeout;
    }

    public Boolean getEnableAmountRound() {
        return enableAmountRound;
    }

    public void setEnableAmountRound(Boolean enableAmountRound) {
        this.enableAmountRound = enableAmountRound;
    }
}
