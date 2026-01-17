package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class PaymentGatewayAuthorizeNet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String paymentGatewayConfigId;

    private String transactionUrl;

    private String certificateAlias;

    private String apiVersion;

    private String delimitedData;

    private String delimiterChar;

    private String cpVersion;

    private String cpMarketType;

    private String cpDeviceType;

    private String method;

    private String emailCustomer;

    private String emailMerchant;

    private String testMode;

    private String relayResponse;

    private String tranKey;

    private String userId;

    private String pwd;

    private String transDescription;

    private BigDecimal duplicateWindow;

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

    public String getTransactionUrl() {
        return transactionUrl;
    }

    public void setTransactionUrl(String transactionUrl) {
        this.transactionUrl = transactionUrl;
    }

    public String getCertificateAlias() {
        return certificateAlias;
    }

    public void setCertificateAlias(String certificateAlias) {
        this.certificateAlias = certificateAlias;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getDelimitedData() {
        return delimitedData;
    }

    public void setDelimitedData(String delimitedData) {
        this.delimitedData = delimitedData;
    }

    public String getDelimiterChar() {
        return delimiterChar;
    }

    public void setDelimiterChar(String delimiterChar) {
        this.delimiterChar = delimiterChar;
    }

    public String getCpVersion() {
        return cpVersion;
    }

    public void setCpVersion(String cpVersion) {
        this.cpVersion = cpVersion;
    }

    public String getCpMarketType() {
        return cpMarketType;
    }

    public void setCpMarketType(String cpMarketType) {
        this.cpMarketType = cpMarketType;
    }

    public String getCpDeviceType() {
        return cpDeviceType;
    }

    public void setCpDeviceType(String cpDeviceType) {
        this.cpDeviceType = cpDeviceType;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getEmailMerchant() {
        return emailMerchant;
    }

    public void setEmailMerchant(String emailMerchant) {
        this.emailMerchant = emailMerchant;
    }

    public String getTestMode() {
        return testMode;
    }

    public void setTestMode(String testMode) {
        this.testMode = testMode;
    }

    public String getRelayResponse() {
        return relayResponse;
    }

    public void setRelayResponse(String relayResponse) {
        this.relayResponse = relayResponse;
    }

    public String getTranKey() {
        return tranKey;
    }

    public void setTranKey(String tranKey) {
        this.tranKey = tranKey;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTransDescription() {
        return transDescription;
    }

    public void setTransDescription(String transDescription) {
        this.transDescription = transDescription;
    }

    public BigDecimal getDuplicateWindow() {
        return duplicateWindow;
    }

    public void setDuplicateWindow(BigDecimal duplicateWindow) {
        this.duplicateWindow = duplicateWindow;
    }
}
