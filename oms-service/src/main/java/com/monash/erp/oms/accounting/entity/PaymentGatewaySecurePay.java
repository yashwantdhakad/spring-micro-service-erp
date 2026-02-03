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
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }
public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
public void setPwd(String pwd) {
        this.pwd = pwd;
    }
public void setServerURL(String serverURL) {
        this.serverURL = serverURL;
    }
public void setProcessTimeout(BigDecimal processTimeout) {
        this.processTimeout = processTimeout;
    }
public void setEnableAmountRound(Boolean enableAmountRound) {
        this.enableAmountRound = enableAmountRound;
    }
}
