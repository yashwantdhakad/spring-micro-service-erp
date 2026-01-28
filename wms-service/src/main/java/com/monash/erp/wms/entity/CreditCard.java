package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentMethodId;
    private String cardType;
    private String cardNumber;
    private String validFromDate;
    private String expireDate;
    private String issueNumber;
    private String companyNameOnCard;
    private String titleOnCard;
    private String firstNameOnCard;
    private String middleNameOnCard;
    private String lastNameOnCard;
    private String suffixOnCard;
    private String contactMechId;
    private BigDecimal consecutiveFailedAuths;
    private LocalDateTime lastFailedAuthDate;
    private BigDecimal consecutiveFailedNsf;
    private LocalDateTime lastFailedNsfDate;
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

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate(String validFromDate) {
        this.validFromDate = validFromDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getCompanyNameOnCard() {
        return companyNameOnCard;
    }

    public void setCompanyNameOnCard(String companyNameOnCard) {
        this.companyNameOnCard = companyNameOnCard;
    }

    public String getTitleOnCard() {
        return titleOnCard;
    }

    public void setTitleOnCard(String titleOnCard) {
        this.titleOnCard = titleOnCard;
    }

    public String getFirstNameOnCard() {
        return firstNameOnCard;
    }

    public void setFirstNameOnCard(String firstNameOnCard) {
        this.firstNameOnCard = firstNameOnCard;
    }

    public String getMiddleNameOnCard() {
        return middleNameOnCard;
    }

    public void setMiddleNameOnCard(String middleNameOnCard) {
        this.middleNameOnCard = middleNameOnCard;
    }

    public String getLastNameOnCard() {
        return lastNameOnCard;
    }

    public void setLastNameOnCard(String lastNameOnCard) {
        this.lastNameOnCard = lastNameOnCard;
    }

    public String getSuffixOnCard() {
        return suffixOnCard;
    }

    public void setSuffixOnCard(String suffixOnCard) {
        this.suffixOnCard = suffixOnCard;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public BigDecimal getConsecutiveFailedAuths() {
        return consecutiveFailedAuths;
    }

    public void setConsecutiveFailedAuths(BigDecimal consecutiveFailedAuths) {
        this.consecutiveFailedAuths = consecutiveFailedAuths;
    }

    public LocalDateTime getLastFailedAuthDate() {
        return lastFailedAuthDate;
    }

    public void setLastFailedAuthDate(LocalDateTime lastFailedAuthDate) {
        this.lastFailedAuthDate = lastFailedAuthDate;
    }

    public BigDecimal getConsecutiveFailedNsf() {
        return consecutiveFailedNsf;
    }

    public void setConsecutiveFailedNsf(BigDecimal consecutiveFailedNsf) {
        this.consecutiveFailedNsf = consecutiveFailedNsf;
    }

    public LocalDateTime getLastFailedNsfDate() {
        return lastFailedNsfDate;
    }

    public void setLastFailedNsfDate(LocalDateTime lastFailedNsfDate) {
        this.lastFailedNsfDate = lastFailedNsfDate;
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