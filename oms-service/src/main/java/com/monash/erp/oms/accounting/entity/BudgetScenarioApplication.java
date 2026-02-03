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
public class BudgetScenarioApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String budgetScenarioApplicId;

    private String budgetScenarioId;

    private String budgetId;

    private String budgetItemSeqId;

    private BigDecimal amountChange;

    private BigDecimal percentageChange;
public void setId(Long id) {
        this.id = id;
    }
public void setBudgetScenarioApplicId(String budgetScenarioApplicId) {
        this.budgetScenarioApplicId = budgetScenarioApplicId;
    }
public void setBudgetScenarioId(String budgetScenarioId) {
        this.budgetScenarioId = budgetScenarioId;
    }
public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }
public void setBudgetItemSeqId(String budgetItemSeqId) {
        this.budgetItemSeqId = budgetItemSeqId;
    }
public void setAmountChange(BigDecimal amountChange) {
        this.amountChange = amountChange;
    }
public void setPercentageChange(BigDecimal percentageChange) {
        this.percentageChange = percentageChange;
    }
}
