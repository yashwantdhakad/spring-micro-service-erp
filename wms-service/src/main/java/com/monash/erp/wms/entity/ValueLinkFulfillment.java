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
public class ValueLinkFulfillment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fulfillmentId;
    private String typeEnumId;
    private String merchantId;
    private String partyId;
    private String orderId;
    private String orderItemSeqId;
    private String surveyResponseId;
    private String cardNumber;
    private String pinNumber;
    private BigDecimal amount;
    private String responseCode;
    private String referenceNum;
    private String authCode;
    private LocalDateTime fulfillmentDate;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setFulfillmentId(String fulfillmentId) {
        this.fulfillmentId = fulfillmentId;
    }
public void setTypeEnumId(String typeEnumId) {
        this.typeEnumId = typeEnumId;
    }
public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setSurveyResponseId(String surveyResponseId) {
        this.surveyResponseId = surveyResponseId;
    }
public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
public void setReferenceNum(String referenceNum) {
        this.referenceNum = referenceNum;
    }
public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
public void setFulfillmentDate(LocalDateTime fulfillmentDate) {
        this.fulfillmentDate = fulfillmentDate;
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
