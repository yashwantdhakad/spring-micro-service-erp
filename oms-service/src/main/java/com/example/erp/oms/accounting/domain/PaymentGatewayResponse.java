package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class PaymentGatewayResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentGatewayResponseId;

    private String paymentServiceTypeEnumId;

    private String orderPaymentPreferenceId;

    private String paymentMethodTypeId;

    private String paymentMethodId;

    private String transCodeEnumId;

    private BigDecimal amount;

    private String currencyUomId;

    private String referenceNum;

    private String altReference;

    private String subReference;

    private String gatewayCode;

    private String gatewayFlag;

    private String gatewayAvsResult;

    private String gatewayCvResult;

    private String gatewayScoreResult;

    private String gatewayMessage;

    private LocalDateTime transactionDate;

    private Boolean resultDeclined;

    private Boolean resultNsf;

    private Boolean resultBadExpire;

    private Boolean resultBadCardNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentGatewayResponseId() {
        return paymentGatewayResponseId;
    }

    public void setPaymentGatewayResponseId(String paymentGatewayResponseId) {
        this.paymentGatewayResponseId = paymentGatewayResponseId;
    }

    public String getPaymentServiceTypeEnumId() {
        return paymentServiceTypeEnumId;
    }

    public void setPaymentServiceTypeEnumId(String paymentServiceTypeEnumId) {
        this.paymentServiceTypeEnumId = paymentServiceTypeEnumId;
    }

    public String getOrderPaymentPreferenceId() {
        return orderPaymentPreferenceId;
    }

    public void setOrderPaymentPreferenceId(String orderPaymentPreferenceId) {
        this.orderPaymentPreferenceId = orderPaymentPreferenceId;
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

    public String getTransCodeEnumId() {
        return transCodeEnumId;
    }

    public void setTransCodeEnumId(String transCodeEnumId) {
        this.transCodeEnumId = transCodeEnumId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getReferenceNum() {
        return referenceNum;
    }

    public void setReferenceNum(String referenceNum) {
        this.referenceNum = referenceNum;
    }

    public String getAltReference() {
        return altReference;
    }

    public void setAltReference(String altReference) {
        this.altReference = altReference;
    }

    public String getSubReference() {
        return subReference;
    }

    public void setSubReference(String subReference) {
        this.subReference = subReference;
    }

    public String getGatewayCode() {
        return gatewayCode;
    }

    public void setGatewayCode(String gatewayCode) {
        this.gatewayCode = gatewayCode;
    }

    public String getGatewayFlag() {
        return gatewayFlag;
    }

    public void setGatewayFlag(String gatewayFlag) {
        this.gatewayFlag = gatewayFlag;
    }

    public String getGatewayAvsResult() {
        return gatewayAvsResult;
    }

    public void setGatewayAvsResult(String gatewayAvsResult) {
        this.gatewayAvsResult = gatewayAvsResult;
    }

    public String getGatewayCvResult() {
        return gatewayCvResult;
    }

    public void setGatewayCvResult(String gatewayCvResult) {
        this.gatewayCvResult = gatewayCvResult;
    }

    public String getGatewayScoreResult() {
        return gatewayScoreResult;
    }

    public void setGatewayScoreResult(String gatewayScoreResult) {
        this.gatewayScoreResult = gatewayScoreResult;
    }

    public String getGatewayMessage() {
        return gatewayMessage;
    }

    public void setGatewayMessage(String gatewayMessage) {
        this.gatewayMessage = gatewayMessage;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Boolean getResultDeclined() {
        return resultDeclined;
    }

    public void setResultDeclined(Boolean resultDeclined) {
        this.resultDeclined = resultDeclined;
    }

    public Boolean getResultNsf() {
        return resultNsf;
    }

    public void setResultNsf(Boolean resultNsf) {
        this.resultNsf = resultNsf;
    }

    public Boolean getResultBadExpire() {
        return resultBadExpire;
    }

    public void setResultBadExpire(Boolean resultBadExpire) {
        this.resultBadExpire = resultBadExpire;
    }

    public Boolean getResultBadCardNumber() {
        return resultBadCardNumber;
    }

    public void setResultBadCardNumber(Boolean resultBadCardNumber) {
        this.resultBadCardNumber = resultBadCardNumber;
    }
}
