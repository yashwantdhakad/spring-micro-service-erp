package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class OrderPaymentPreference {

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

    public String getOrderPaymentPreferenceId() {
        return orderPaymentPreferenceId;
    }

    public void setOrderPaymentPreferenceId(String orderPaymentPreferenceId) {
        this.orderPaymentPreferenceId = orderPaymentPreferenceId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public String getProductPricePurposeId() {
        return productPricePurposeId;
    }

    public void setProductPricePurposeId(String productPricePurposeId) {
        this.productPricePurposeId = productPricePurposeId;
    }

    public String getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getFinAccountId() {
        return finAccountId;
    }

    public void setFinAccountId(String finAccountId) {
        this.finAccountId = finAccountId;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getTrack2() {
        return track2;
    }

    public void setTrack2(String track2) {
        this.track2 = track2;
    }

    public String getPresentFlag() {
        return presentFlag;
    }

    public void setPresentFlag(String presentFlag) {
        this.presentFlag = presentFlag;
    }

    public String getSwipedFlag() {
        return swipedFlag;
    }

    public void setSwipedFlag(String swipedFlag) {
        this.swipedFlag = swipedFlag;
    }

    public String getOverflowFlag() {
        return overflowFlag;
    }

    public void setOverflowFlag(String overflowFlag) {
        this.overflowFlag = overflowFlag;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public BigDecimal getProcessAttempt() {
        return processAttempt;
    }

    public void setProcessAttempt(BigDecimal processAttempt) {
        this.processAttempt = processAttempt;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    public String getManualAuthCode() {
        return manualAuthCode;
    }

    public void setManualAuthCode(String manualAuthCode) {
        this.manualAuthCode = manualAuthCode;
    }

    public String getManualRefNum() {
        return manualRefNum;
    }

    public void setManualRefNum(String manualRefNum) {
        this.manualRefNum = manualRefNum;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getNeedsNsfRetry() {
        return needsNsfRetry;
    }

    public void setNeedsNsfRetry(String needsNsfRetry) {
        this.needsNsfRetry = needsNsfRetry;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
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