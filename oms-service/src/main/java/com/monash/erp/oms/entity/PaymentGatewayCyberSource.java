package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
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
    private String enableDav;
    private String fraudScore;
    private String ignoreAvs;
    private String disableBillAvs;
    private String avsDeclineCodes;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;

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

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getKeysDir() {
        return keysDir;
    }

    public void setKeysDir(String keysDir) {
        this.keysDir = keysDir;
    }

    public String getKeysFile() {
        return keysFile;
    }

    public void setKeysFile(String keysFile) {
        this.keysFile = keysFile;
    }

    public String getLogEnabled() {
        return logEnabled;
    }

    public void setLogEnabled(String logEnabled) {
        this.logEnabled = logEnabled;
    }

    public String getLogDir() {
        return logDir;
    }

    public void setLogDir(String logDir) {
        this.logDir = logDir;
    }

    public String getLogFile() {
        return logFile;
    }

    public void setLogFile(String logFile) {
        this.logFile = logFile;
    }

    public BigDecimal getLogSize() {
        return logSize;
    }

    public void setLogSize(BigDecimal logSize) {
        this.logSize = logSize;
    }

    public String getMerchantDescr() {
        return merchantDescr;
    }

    public void setMerchantDescr(String merchantDescr) {
        this.merchantDescr = merchantDescr;
    }

    public String getMerchantContact() {
        return merchantContact;
    }

    public void setMerchantContact(String merchantContact) {
        this.merchantContact = merchantContact;
    }

    public String getAutoBill() {
        return autoBill;
    }

    public void setAutoBill(String autoBill) {
        this.autoBill = autoBill;
    }

    public String getEnableDav() {
        return enableDav;
    }

    public void setEnableDav(String enableDav) {
        this.enableDav = enableDav;
    }

    public String getFraudScore() {
        return fraudScore;
    }

    public void setFraudScore(String fraudScore) {
        this.fraudScore = fraudScore;
    }

    public String getIgnoreAvs() {
        return ignoreAvs;
    }

    public void setIgnoreAvs(String ignoreAvs) {
        this.ignoreAvs = ignoreAvs;
    }

    public String getDisableBillAvs() {
        return disableBillAvs;
    }

    public void setDisableBillAvs(String disableBillAvs) {
        this.disableBillAvs = disableBillAvs;
    }

    public String getAvsDeclineCodes() {
        return avsDeclineCodes;
    }

    public void setAvsDeclineCodes(String avsDeclineCodes) {
        this.avsDeclineCodes = avsDeclineCodes;
    }

    public LocalDateTime getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public LocalDateTime getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public LocalDateTime getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }

    public LocalDateTime getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}