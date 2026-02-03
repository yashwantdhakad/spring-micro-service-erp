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
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentId;

    private String paymentTypeId;

    private String paymentMethodTypeId;

    private String paymentMethodId;

    private String paymentGatewayResponseId;

    private String paymentPreferenceId;

    private String partyIdFrom;

    private String partyIdTo;

    private String roleTypeIdTo;

    private String statusId;

    private LocalDateTime effectiveDate;

    private String paymentRefNum;

    private BigDecimal amount;

    private String currencyUomId;

    private String comments;

    private String finAccountTransId;

    private String overrideGlAccountId;

    private BigDecimal actualCurrencyAmount;

    private String actualCurrencyUomId;
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }
public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }
public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
public void setPaymentGatewayResponseId(String paymentGatewayResponseId) {
        this.paymentGatewayResponseId = paymentGatewayResponseId;
    }
public void setPaymentPreferenceId(String paymentPreferenceId) {
        this.paymentPreferenceId = paymentPreferenceId;
    }
public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
public void setRoleTypeIdTo(String roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setEffectiveDate(LocalDateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
public void setPaymentRefNum(String paymentRefNum) {
        this.paymentRefNum = paymentRefNum;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setFinAccountTransId(String finAccountTransId) {
        this.finAccountTransId = finAccountTransId;
    }
public void setOverrideGlAccountId(String overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }
public void setActualCurrencyAmount(BigDecimal actualCurrencyAmount) {
        this.actualCurrencyAmount = actualCurrencyAmount;
    }
public void setActualCurrencyUomId(String actualCurrencyUomId) {
        this.actualCurrencyUomId = actualCurrencyUomId;
    }
}
