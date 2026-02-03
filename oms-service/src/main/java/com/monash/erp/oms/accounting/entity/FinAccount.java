package com.monash.erp.oms.accounting.entity;

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

    private Boolean isRefundable;

    private String replenishPaymentId;

    private BigDecimal replenishLevel;

    private BigDecimal actualBalance;

    private BigDecimal availableBalance;
public void setId(Long id) {
        this.id = id;
    }
public void setFinAccountId(String finAccountId) {
        this.finAccountId = finAccountId;
    }
public void setFinAccountTypeId(String finAccountTypeId) {
        this.finAccountTypeId = finAccountTypeId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setFinAccountName(String finAccountName) {
        this.finAccountName = finAccountName;
    }
public void setFinAccountCode(String finAccountCode) {
        this.finAccountCode = finAccountCode;
    }
public void setFinAccountPin(String finAccountPin) {
        this.finAccountPin = finAccountPin;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
public void setOwnerPartyId(String ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }
public void setPostToGlAccountId(String postToGlAccountId) {
        this.postToGlAccountId = postToGlAccountId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setIsRefundable(Boolean isRefundable) {
        this.isRefundable = isRefundable;
    }
public void setReplenishPaymentId(String replenishPaymentId) {
        this.replenishPaymentId = replenishPaymentId;
    }
public void setReplenishLevel(BigDecimal replenishLevel) {
        this.replenishLevel = replenishLevel;
    }
public void setActualBalance(BigDecimal actualBalance) {
        this.actualBalance = actualBalance;
    }
public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }
}
