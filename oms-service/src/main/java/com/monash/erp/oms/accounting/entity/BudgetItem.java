package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class BudgetItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String budgetId;

    private String budgetItemSeqId;

    private String budgetItemTypeId;

    private BigDecimal amount;

    private String purpose;

    private String justification;
public void setId(Long id) {
        this.id = id;
    }
public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }
public void setBudgetItemSeqId(String budgetItemSeqId) {
        this.budgetItemSeqId = budgetItemSeqId;
    }
public void setBudgetItemTypeId(String budgetItemTypeId) {
        this.budgetItemTypeId = budgetItemTypeId;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
public void setJustification(String justification) {
        this.justification = justification;
    }
}
