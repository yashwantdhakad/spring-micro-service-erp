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
public class ReturnItemResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String returnItemResponseId;
    private String orderPaymentPreferenceId;
    private String replacementOrderId;
    private String paymentId;
    private String billingAccountId;
    private String finAccountTransId;
    private BigDecimal responseAmount;
    private LocalDateTime responseDate;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setReturnItemResponseId(String returnItemResponseId) {
        this.returnItemResponseId = returnItemResponseId;
    }
public void setOrderPaymentPreferenceId(String orderPaymentPreferenceId) {
        this.orderPaymentPreferenceId = orderPaymentPreferenceId;
    }
public void setReplacementOrderId(String replacementOrderId) {
        this.replacementOrderId = replacementOrderId;
    }
public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }
public void setFinAccountTransId(String finAccountTransId) {
        this.finAccountTransId = finAccountTransId;
    }
public void setResponseAmount(BigDecimal responseAmount) {
        this.responseAmount = responseAmount;
    }
public void setResponseDate(LocalDateTime responseDate) {
        this.responseDate = responseDate;
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
