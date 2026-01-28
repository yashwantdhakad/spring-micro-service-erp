package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class FinAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String finAccountId;
    private String finAccountTypeId;
    private String statusId;
    private String finAccountName;
    private String finAccountCode;
    private String finAccountPin;
    private String currencyUomId;
    private String organizationPartyId;
    private String ownerPartyId;
    private String postToGlAccountId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String isRefundable;
    private String replenishPaymentId;
    private BigDecimal replenishLevel;
    private BigDecimal actualBalance;
    private BigDecimal availableBalance;
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

    public String getFinAccountId() {
        return finAccountId;
    }

    public void setFinAccountId(String finAccountId) {
        this.finAccountId = finAccountId;
    }

    public String getFinAccountTypeId() {
        return finAccountTypeId;
    }

    public void setFinAccountTypeId(String finAccountTypeId) {
        this.finAccountTypeId = finAccountTypeId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getFinAccountName() {
        return finAccountName;
    }

    public void setFinAccountName(String finAccountName) {
        this.finAccountName = finAccountName;
    }

    public String getFinAccountCode() {
        return finAccountCode;
    }

    public void setFinAccountCode(String finAccountCode) {
        this.finAccountCode = finAccountCode;
    }

    public String getFinAccountPin() {
        return finAccountPin;
    }

    public void setFinAccountPin(String finAccountPin) {
        this.finAccountPin = finAccountPin;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public String getOwnerPartyId() {
        return ownerPartyId;
    }

    public void setOwnerPartyId(String ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }

    public String getPostToGlAccountId() {
        return postToGlAccountId;
    }

    public void setPostToGlAccountId(String postToGlAccountId) {
        this.postToGlAccountId = postToGlAccountId;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

    public String getIsRefundable() {
        return isRefundable;
    }

    public void setIsRefundable(String isRefundable) {
        this.isRefundable = isRefundable;
    }

    public String getReplenishPaymentId() {
        return replenishPaymentId;
    }

    public void setReplenishPaymentId(String replenishPaymentId) {
        this.replenishPaymentId = replenishPaymentId;
    }

    public BigDecimal getReplenishLevel() {
        return replenishLevel;
    }

    public void setReplenishLevel(BigDecimal replenishLevel) {
        this.replenishLevel = replenishLevel;
    }

    public BigDecimal getActualBalance() {
        return actualBalance;
    }

    public void setActualBalance(BigDecimal actualBalance) {
        this.actualBalance = actualBalance;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
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