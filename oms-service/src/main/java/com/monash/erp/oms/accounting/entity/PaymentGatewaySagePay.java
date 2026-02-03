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
public class PaymentGatewaySagePay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentGatewayConfigId;

    private String vendor;

    private String productionHost;

    private String testingHost;

    private String sagePayMode;

    private String protocolVersion;

    private String authenticationTransType;

    private String authenticationUrl;

    private String authoriseTransType;

    private String authoriseUrl;

    private String releaseTransType;

    private String releaseUrl;

    private String voidUrl;

    private String refundUrl;
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }
public void setVendor(String vendor) {
        this.vendor = vendor;
    }
public void setProductionHost(String productionHost) {
        this.productionHost = productionHost;
    }
public void setTestingHost(String testingHost) {
        this.testingHost = testingHost;
    }
public void setSagePayMode(String sagePayMode) {
        this.sagePayMode = sagePayMode;
    }
public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }
public void setAuthenticationTransType(String authenticationTransType) {
        this.authenticationTransType = authenticationTransType;
    }
public void setAuthenticationUrl(String authenticationUrl) {
        this.authenticationUrl = authenticationUrl;
    }
public void setAuthoriseTransType(String authoriseTransType) {
        this.authoriseTransType = authoriseTransType;
    }
public void setAuthoriseUrl(String authoriseUrl) {
        this.authoriseUrl = authoriseUrl;
    }
public void setReleaseTransType(String releaseTransType) {
        this.releaseTransType = releaseTransType;
    }
public void setReleaseUrl(String releaseUrl) {
        this.releaseUrl = releaseUrl;
    }
public void setVoidUrl(String voidUrl) {
        this.voidUrl = voidUrl;
    }
public void setRefundUrl(String refundUrl) {
        this.refundUrl = refundUrl;
    }
}
