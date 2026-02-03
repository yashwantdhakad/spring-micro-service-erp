package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setFinAccountTypeId(String finAccountTypeId) {
        this.finAccountTypeId = finAccountTypeId;
    }
public void setRequirePinCode(String requirePinCode) {
        this.requirePinCode = requirePinCode;
    }
public void setValidateGCFinAcct(String validateGCFinAcct) {
        this.validateGCFinAcct = validateGCFinAcct;
    }
public void setAccountCodeLength(BigDecimal accountCodeLength) {
        this.accountCodeLength = accountCodeLength;
    }
public void setPinCodeLength(BigDecimal pinCodeLength) {
        this.pinCodeLength = pinCodeLength;
    }
public void setAccountValidDays(BigDecimal accountValidDays) {
        this.accountValidDays = accountValidDays;
    }
public void setAuthValidDays(BigDecimal authValidDays) {
        this.authValidDays = authValidDays;
    }
public void setPurchaseSurveyId(String purchaseSurveyId) {
        this.purchaseSurveyId = purchaseSurveyId;
    }
public void setPurchSurveySendTo(String purchSurveySendTo) {
        this.purchSurveySendTo = purchSurveySendTo;
    }
public void setPurchSurveyCopyMe(String purchSurveyCopyMe) {
        this.purchSurveyCopyMe = purchSurveyCopyMe;
    }
public void setAllowAuthToNegative(String allowAuthToNegative) {
        this.allowAuthToNegative = allowAuthToNegative;
    }
public void setMinBalance(BigDecimal minBalance) {
        this.minBalance = minBalance;
    }
public void setReplenishThreshold(BigDecimal replenishThreshold) {
        this.replenishThreshold = replenishThreshold;
    }
public void setReplenishMethodEnumId(String replenishMethodEnumId) {
        this.replenishMethodEnumId = replenishMethodEnumId;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}
