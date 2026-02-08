package com.monash.erp.oms.party.entity;

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
public class PayrollPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyId;
    private String roleTypeId;
    private String payrollPreferenceSeqId;
    private String deductionTypeId;
    private String paymentMethodTypeId;
    private String periodTypeId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private BigDecimal percentage;
    private BigDecimal flatAmount;
    private String routingNumber;
    private String accountNumber;
    private String bankName;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setPayrollPreferenceSeqId(String payrollPreferenceSeqId) {
        this.payrollPreferenceSeqId = payrollPreferenceSeqId;
    }
public void setDeductionTypeId(String deductionTypeId) {
        this.deductionTypeId = deductionTypeId;
    }
public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }
public void setPeriodTypeId(String periodTypeId) {
        this.periodTypeId = periodTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }
public void setFlatAmount(BigDecimal flatAmount) {
        this.flatAmount = flatAmount;
    }
public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }
public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
public void setBankName(String bankName) {
        this.bankName = bankName;
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
