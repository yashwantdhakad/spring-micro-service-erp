package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class EftAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentMethodId;

    private String bankName;

    private String routingNumber;

    private String accountType;

    private String accountNumber;

    private String nameOnAccount;

    private String companyNameOnAccount;

    private String contactMechId;

    private BigDecimal yearsAtBank;

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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNameOnAccount() {
        return nameOnAccount;
    }

    public void setNameOnAccount(String nameOnAccount) {
        this.nameOnAccount = nameOnAccount;
    }

    public String getCompanyNameOnAccount() {
        return companyNameOnAccount;
    }

    public void setCompanyNameOnAccount(String companyNameOnAccount) {
        this.companyNameOnAccount = companyNameOnAccount;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public BigDecimal getYearsAtBank() {
        return yearsAtBank;
    }

    public void setYearsAtBank(BigDecimal yearsAtBank) {
        this.yearsAtBank = yearsAtBank;
    }
}
