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
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String budgetId;

    private String budgetTypeId;

    private String customTimePeriodId;

    private String comments;
public void setId(Long id) {
        this.id = id;
    }
public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }
public void setBudgetTypeId(String budgetTypeId) {
        this.budgetTypeId = budgetTypeId;
    }
public void setCustomTimePeriodId(String customTimePeriodId) {
        this.customTimePeriodId = customTimePeriodId;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
}
