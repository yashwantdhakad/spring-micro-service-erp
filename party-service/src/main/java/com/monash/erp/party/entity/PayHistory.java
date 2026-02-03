package com.monash.erp.party.entity;

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
public class PayHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roleTypeIdFrom;
    private String roleTypeIdTo;
    private String partyIdFrom;
    private String partyIdTo;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String salaryStepSeqId;
    private String payGradeId;
    private String periodTypeId;
    private BigDecimal amount;
    private String comments;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setRoleTypeIdFrom(String roleTypeIdFrom) {
        this.roleTypeIdFrom = roleTypeIdFrom;
    }
public void setRoleTypeIdTo(String roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
    }
public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setSalaryStepSeqId(String salaryStepSeqId) {
        this.salaryStepSeqId = salaryStepSeqId;
    }
public void setPayGradeId(String payGradeId) {
        this.payGradeId = payGradeId;
    }
public void setPeriodTypeId(String periodTypeId) {
        this.periodTypeId = periodTypeId;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
public void setComments(String comments) {
        this.comments = comments;
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
