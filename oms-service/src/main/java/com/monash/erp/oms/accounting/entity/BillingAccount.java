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
public class BillingAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String billingAccountId;

    private BigDecimal accountLimit;

    private String accountCurrencyUomId;

    private String contactMechId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private String description;

    private String externalAccountId;
public void setId(Long id) {
        this.id = id;
    }
public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }
public void setAccountLimit(BigDecimal accountLimit) {
        this.accountLimit = accountLimit;
    }
public void setAccountCurrencyUomId(String accountCurrencyUomId) {
        this.accountCurrencyUomId = accountCurrencyUomId;
    }
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setExternalAccountId(String externalAccountId) {
        this.externalAccountId = externalAccountId;
    }
}
