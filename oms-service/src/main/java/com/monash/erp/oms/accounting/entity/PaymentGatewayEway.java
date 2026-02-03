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
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }
public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
public void setRefundPwd(String refundPwd) {
        this.refundPwd = refundPwd;
    }
public void setTestMode(String testMode) {
        this.testMode = testMode;
    }
public void setEnableCvn(String enableCvn) {
        this.enableCvn = enableCvn;
    }
public void setEnableBeagle(String enableBeagle) {
        this.enableBeagle = enableBeagle;
    }
}
