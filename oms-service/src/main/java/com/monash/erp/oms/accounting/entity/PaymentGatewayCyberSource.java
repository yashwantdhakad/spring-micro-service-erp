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
public class PaymentGatewayCyberSource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentGatewayConfigId;

    private String merchantId;

    private String apiVersion;

    private String production;

    private String keysDir;

    private String keysFile;

    private String logEnabled;

    private String logDir;

    private String logFile;

    private BigDecimal logSize;

    private String merchantDescr;

    private String merchantContact;

    private String autoBill;

    private Boolean enableDav;

    private Boolean fraudScore;

    private String ignoreAvs;

    private Boolean disableBillAvs;

    private String avsDeclineCodes;
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }
public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }
public void setProduction(String production) {
        this.production = production;
    }
public void setKeysDir(String keysDir) {
        this.keysDir = keysDir;
    }
public void setKeysFile(String keysFile) {
        this.keysFile = keysFile;
    }
public void setLogEnabled(String logEnabled) {
        this.logEnabled = logEnabled;
    }
public void setLogDir(String logDir) {
        this.logDir = logDir;
    }
public void setLogFile(String logFile) {
        this.logFile = logFile;
    }
public void setLogSize(BigDecimal logSize) {
        this.logSize = logSize;
    }
public void setMerchantDescr(String merchantDescr) {
        this.merchantDescr = merchantDescr;
    }
public void setMerchantContact(String merchantContact) {
        this.merchantContact = merchantContact;
    }
public void setAutoBill(String autoBill) {
        this.autoBill = autoBill;
    }
public void setEnableDav(Boolean enableDav) {
        this.enableDav = enableDav;
    }
public void setFraudScore(Boolean fraudScore) {
        this.fraudScore = fraudScore;
    }
public void setIgnoreAvs(String ignoreAvs) {
        this.ignoreAvs = ignoreAvs;
    }
public void setDisableBillAvs(Boolean disableBillAvs) {
        this.disableBillAvs = disableBillAvs;
    }
public void setAvsDeclineCodes(String avsDeclineCodes) {
        this.avsDeclineCodes = avsDeclineCodes;
    }
}
