package com.monash.erp.oms.entity;

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
public class OrderPaymentPreference extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderPaymentPreferenceId;
    private String orderId;
    private String orderItemSeqId;
    private String shipGroupSeqId;
    private String productPricePurposeId;
    private String paymentMethodTypeId;
    private String paymentMethodId;
    private String finAccountId;
    private String securityCode;
    private String track2;
    private String presentFlag;
    private String swipedFlag;
    private String overflowFlag;
    private BigDecimal maxAmount;
    private BigDecimal processAttempt;
    private String billingPostalCode;
    private String manualAuthCode;
    private String manualRefNum;
    private String statusId;
    private String needsNsfRetry;
    private LocalDateTime createdDate;
    private String createdByUserLogin;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderPaymentPreferenceId(String orderPaymentPreferenceId) {
        this.orderPaymentPreferenceId = orderPaymentPreferenceId;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }
public void setProductPricePurposeId(String productPricePurposeId) {
        this.productPricePurposeId = productPricePurposeId;
    }
public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }
public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
public void setFinAccountId(String finAccountId) {
        this.finAccountId = finAccountId;
    }
public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }
public void setTrack2(String track2) {
        this.track2 = track2;
    }
public void setPresentFlag(String presentFlag) {
        this.presentFlag = presentFlag;
    }
public void setSwipedFlag(String swipedFlag) {
        this.swipedFlag = swipedFlag;
    }
public void setOverflowFlag(String overflowFlag) {
        this.overflowFlag = overflowFlag;
    }
public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }
public void setProcessAttempt(BigDecimal processAttempt) {
        this.processAttempt = processAttempt;
    }
public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }
public void setManualAuthCode(String manualAuthCode) {
        this.manualAuthCode = manualAuthCode;
    }
public void setManualRefNum(String manualRefNum) {
        this.manualRefNum = manualRefNum;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setNeedsNsfRetry(String needsNsfRetry) {
        this.needsNsfRetry = needsNsfRetry;
    }
public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

}
