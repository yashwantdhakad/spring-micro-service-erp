package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
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

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getProductionHost() {
        return productionHost;
    }

    public void setProductionHost(String productionHost) {
        this.productionHost = productionHost;
    }

    public String getTestingHost() {
        return testingHost;
    }

    public void setTestingHost(String testingHost) {
        this.testingHost = testingHost;
    }

    public String getSagePayMode() {
        return sagePayMode;
    }

    public void setSagePayMode(String sagePayMode) {
        this.sagePayMode = sagePayMode;
    }

    public String getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public String getAuthenticationTransType() {
        return authenticationTransType;
    }

    public void setAuthenticationTransType(String authenticationTransType) {
        this.authenticationTransType = authenticationTransType;
    }

    public String getAuthenticationUrl() {
        return authenticationUrl;
    }

    public void setAuthenticationUrl(String authenticationUrl) {
        this.authenticationUrl = authenticationUrl;
    }

    public String getAuthoriseTransType() {
        return authoriseTransType;
    }

    public void setAuthoriseTransType(String authoriseTransType) {
        this.authoriseTransType = authoriseTransType;
    }

    public String getAuthoriseUrl() {
        return authoriseUrl;
    }

    public void setAuthoriseUrl(String authoriseUrl) {
        this.authoriseUrl = authoriseUrl;
    }

    public String getReleaseTransType() {
        return releaseTransType;
    }

    public void setReleaseTransType(String releaseTransType) {
        this.releaseTransType = releaseTransType;
    }

    public String getReleaseUrl() {
        return releaseUrl;
    }

    public void setReleaseUrl(String releaseUrl) {
        this.releaseUrl = releaseUrl;
    }

    public String getVoidUrl() {
        return voidUrl;
    }

    public void setVoidUrl(String voidUrl) {
        this.voidUrl = voidUrl;
    }

    public String getRefundUrl() {
        return refundUrl;
    }

    public void setRefundUrl(String refundUrl) {
        this.refundUrl = refundUrl;
    }
}
