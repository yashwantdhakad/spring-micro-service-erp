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
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
public void setCardType(String cardType) {
        this.cardType = cardType;
    }
public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
public void setValidFromDate(String validFromDate) {
        this.validFromDate = validFromDate;
    }
public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }
public void setCompanyNameOnCard(String companyNameOnCard) {
        this.companyNameOnCard = companyNameOnCard;
    }
public void setTitleOnCard(String titleOnCard) {
        this.titleOnCard = titleOnCard;
    }
public void setFirstNameOnCard(String firstNameOnCard) {
        this.firstNameOnCard = firstNameOnCard;
    }
public void setMiddleNameOnCard(String middleNameOnCard) {
        this.middleNameOnCard = middleNameOnCard;
    }
public void setLastNameOnCard(String lastNameOnCard) {
        this.lastNameOnCard = lastNameOnCard;
    }
public void setSuffixOnCard(String suffixOnCard) {
        this.suffixOnCard = suffixOnCard;
    }
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
public void setConsecutiveFailedAuths(BigDecimal consecutiveFailedAuths) {
        this.consecutiveFailedAuths = consecutiveFailedAuths;
    }
public void setLastFailedAuthDate(LocalDateTime lastFailedAuthDate) {
        this.lastFailedAuthDate = lastFailedAuthDate;
    }
public void setConsecutiveFailedNsf(BigDecimal consecutiveFailedNsf) {
        this.consecutiveFailedNsf = consecutiveFailedNsf;
    }
public void setLastFailedNsfDate(LocalDateTime lastFailedNsfDate) {
        this.lastFailedNsfDate = lastFailedNsfDate;
    }
}
