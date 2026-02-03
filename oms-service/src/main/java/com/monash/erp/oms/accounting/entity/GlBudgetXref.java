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
public class GlBudgetXref {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glAccountId;

    private String budgetItemTypeId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private BigDecimal allocationPercentage;
public void setId(Long id) {
        this.id = id;
    }
public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
public void setBudgetItemTypeId(String budgetItemTypeId) {
        this.budgetItemTypeId = budgetItemTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setAllocationPercentage(BigDecimal allocationPercentage) {
        this.allocationPercentage = allocationPercentage;
    }
}
