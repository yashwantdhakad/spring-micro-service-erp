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
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }
public void setTransactionUrl(String transactionUrl) {
        this.transactionUrl = transactionUrl;
    }
public void setCertificateAlias(String certificateAlias) {
        this.certificateAlias = certificateAlias;
    }
public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }
public void setDelimitedData(String delimitedData) {
        this.delimitedData = delimitedData;
    }
public void setDelimiterChar(String delimiterChar) {
        this.delimiterChar = delimiterChar;
    }
public void setCpVersion(String cpVersion) {
        this.cpVersion = cpVersion;
    }
public void setCpMarketType(String cpMarketType) {
        this.cpMarketType = cpMarketType;
    }
public void setCpDeviceType(String cpDeviceType) {
        this.cpDeviceType = cpDeviceType;
    }
public void setMethod(String method) {
        this.method = method;
    }
public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }
public void setEmailMerchant(String emailMerchant) {
        this.emailMerchant = emailMerchant;
    }
public void setTestMode(String testMode) {
        this.testMode = testMode;
    }
public void setRelayResponse(String relayResponse) {
        this.relayResponse = relayResponse;
    }
public void setTranKey(String tranKey) {
        this.tranKey = tranKey;
    }
public void setUserId(String userId) {
        this.userId = userId;
    }
public void setPwd(String pwd) {
        this.pwd = pwd;
    }
public void setTransDescription(String transDescription) {
        this.transDescription = transDescription;
    }
public void setDuplicateWindow(BigDecimal duplicateWindow) {
        this.duplicateWindow = duplicateWindow;
    }
}
