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
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentGatewayResponseId(String paymentGatewayResponseId) {
        this.paymentGatewayResponseId = paymentGatewayResponseId;
    }
public void setPaymentServiceTypeEnumId(String paymentServiceTypeEnumId) {
        this.paymentServiceTypeEnumId = paymentServiceTypeEnumId;
    }
public void setOrderPaymentPreferenceId(String orderPaymentPreferenceId) {
        this.orderPaymentPreferenceId = orderPaymentPreferenceId;
    }
public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }
public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
public void setTransCodeEnumId(String transCodeEnumId) {
        this.transCodeEnumId = transCodeEnumId;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setReferenceNum(String referenceNum) {
        this.referenceNum = referenceNum;
    }
public void setAltReference(String altReference) {
        this.altReference = altReference;
    }
public void setSubReference(String subReference) {
        this.subReference = subReference;
    }
public void setGatewayCode(String gatewayCode) {
        this.gatewayCode = gatewayCode;
    }
public void setGatewayFlag(String gatewayFlag) {
        this.gatewayFlag = gatewayFlag;
    }
public void setGatewayAvsResult(String gatewayAvsResult) {
        this.gatewayAvsResult = gatewayAvsResult;
    }
public void setGatewayCvResult(String gatewayCvResult) {
        this.gatewayCvResult = gatewayCvResult;
    }
public void setGatewayScoreResult(String gatewayScoreResult) {
        this.gatewayScoreResult = gatewayScoreResult;
    }
public void setGatewayMessage(String gatewayMessage) {
        this.gatewayMessage = gatewayMessage;
    }
public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
public void setResultDeclined(Boolean resultDeclined) {
        this.resultDeclined = resultDeclined;
    }
public void setResultNsf(Boolean resultNsf) {
        this.resultNsf = resultNsf;
    }
public void setResultBadExpire(Boolean resultBadExpire) {
        this.resultBadExpire = resultBadExpire;
    }
public void setResultBadCardNumber(Boolean resultBadCardNumber) {
        this.resultBadCardNumber = resultBadCardNumber;
    }
}
