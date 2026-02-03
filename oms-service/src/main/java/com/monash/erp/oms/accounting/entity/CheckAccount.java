package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class CheckAccount {

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

    private String branchCode;
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
public void setBankName(String bankName) {
        this.bankName = bankName;
    }
public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }
public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
public void setNameOnAccount(String nameOnAccount) {
        this.nameOnAccount = nameOnAccount;
    }
public void setCompanyNameOnAccount(String companyNameOnAccount) {
        this.companyNameOnAccount = companyNameOnAccount;
    }
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
}
