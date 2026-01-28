package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class ProductStoreFinActSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productStoreId;
    private String finAccountTypeId;
    private String requirePinCode;
    private String validateGCFinAcct;
    private BigDecimal accountCodeLength;
    private BigDecimal pinCodeLength;
    private BigDecimal accountValidDays;
    private BigDecimal authValidDays;
    private String purchaseSurveyId;
    private String purchSurveySendTo;
    private String purchSurveyCopyMe;
    private String allowAuthToNegative;
    private BigDecimal minBalance;
    private BigDecimal replenishThreshold;
    private String replenishMethodEnumId;
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

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getFinAccountTypeId() {
        return finAccountTypeId;
    }

    public void setFinAccountTypeId(String finAccountTypeId) {
        this.finAccountTypeId = finAccountTypeId;
    }

    public String getRequirePinCode() {
        return requirePinCode;
    }

    public void setRequirePinCode(String requirePinCode) {
        this.requirePinCode = requirePinCode;
    }

    public String getValidateGCFinAcct() {
        return validateGCFinAcct;
    }

    public void setValidateGCFinAcct(String validateGCFinAcct) {
        this.validateGCFinAcct = validateGCFinAcct;
    }

    public BigDecimal getAccountCodeLength() {
        return accountCodeLength;
    }

    public void setAccountCodeLength(BigDecimal accountCodeLength) {
        this.accountCodeLength = accountCodeLength;
    }

    public BigDecimal getPinCodeLength() {
        return pinCodeLength;
    }

    public void setPinCodeLength(BigDecimal pinCodeLength) {
        this.pinCodeLength = pinCodeLength;
    }

    public BigDecimal getAccountValidDays() {
        return accountValidDays;
    }

    public void setAccountValidDays(BigDecimal accountValidDays) {
        this.accountValidDays = accountValidDays;
    }

    public BigDecimal getAuthValidDays() {
        return authValidDays;
    }

    public void setAuthValidDays(BigDecimal authValidDays) {
        this.authValidDays = authValidDays;
    }

    public String getPurchaseSurveyId() {
        return purchaseSurveyId;
    }

    public void setPurchaseSurveyId(String purchaseSurveyId) {
        this.purchaseSurveyId = purchaseSurveyId;
    }

    public String getPurchSurveySendTo() {
        return purchSurveySendTo;
    }

    public void setPurchSurveySendTo(String purchSurveySendTo) {
        this.purchSurveySendTo = purchSurveySendTo;
    }

    public String getPurchSurveyCopyMe() {
        return purchSurveyCopyMe;
    }

    public void setPurchSurveyCopyMe(String purchSurveyCopyMe) {
        this.purchSurveyCopyMe = purchSurveyCopyMe;
    }

    public String getAllowAuthToNegative() {
        return allowAuthToNegative;
    }

    public void setAllowAuthToNegative(String allowAuthToNegative) {
        this.allowAuthToNegative = allowAuthToNegative;
    }

    public BigDecimal getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(BigDecimal minBalance) {
        this.minBalance = minBalance;
    }

    public BigDecimal getReplenishThreshold() {
        return replenishThreshold;
    }

    public void setReplenishThreshold(BigDecimal replenishThreshold) {
        this.replenishThreshold = replenishThreshold;
    }

    public String getReplenishMethodEnumId() {
        return replenishMethodEnumId;
    }

    public void setReplenishMethodEnumId(String replenishMethodEnumId) {
        this.replenishMethodEnumId = replenishMethodEnumId;
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