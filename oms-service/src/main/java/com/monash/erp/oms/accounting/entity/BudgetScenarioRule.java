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
public class BudgetScenarioRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String budgetScenarioId;

    private String budgetItemTypeId;

    private BigDecimal amountChange;

    private BigDecimal percentageChange;
public void setId(Long id) {
        this.id = id;
    }
public void setBudgetScenarioId(String budgetScenarioId) {
        this.budgetScenarioId = budgetScenarioId;
    }
public void setBudgetItemTypeId(String budgetItemTypeId) {
        this.budgetItemTypeId = budgetItemTypeId;
    }
public void setAmountChange(BigDecimal amountChange) {
        this.amountChange = amountChange;
    }
public void setPercentageChange(BigDecimal percentageChange) {
        this.percentageChange = percentageChange;
    }
}
