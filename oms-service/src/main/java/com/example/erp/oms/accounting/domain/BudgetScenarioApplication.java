package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBudgetScenarioApplicId() {
        return budgetScenarioApplicId;
    }

    public void setBudgetScenarioApplicId(String budgetScenarioApplicId) {
        this.budgetScenarioApplicId = budgetScenarioApplicId;
    }

    public String getBudgetScenarioId() {
        return budgetScenarioId;
    }

    public void setBudgetScenarioId(String budgetScenarioId) {
        this.budgetScenarioId = budgetScenarioId;
    }

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public String getBudgetItemSeqId() {
        return budgetItemSeqId;
    }

    public void setBudgetItemSeqId(String budgetItemSeqId) {
        this.budgetItemSeqId = budgetItemSeqId;
    }

    public BigDecimal getAmountChange() {
        return amountChange;
    }

    public void setAmountChange(BigDecimal amountChange) {
        this.amountChange = amountChange;
    }

    public BigDecimal getPercentageChange() {
        return percentageChange;
    }

    public void setPercentageChange(BigDecimal percentageChange) {
        this.percentageChange = percentageChange;
    }
}
