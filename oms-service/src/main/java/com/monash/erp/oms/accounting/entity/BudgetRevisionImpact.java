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
public class BudgetRevisionImpact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String budgetId;

    private String budgetItemSeqId;

    private String revisionSeqId;

    private BigDecimal revisedAmount;

    private Boolean addDeleteFlag;

    private String revisionReason;
public void setId(Long id) {
        this.id = id;
    }
public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }
public void setBudgetItemSeqId(String budgetItemSeqId) {
        this.budgetItemSeqId = budgetItemSeqId;
    }
public void setRevisionSeqId(String revisionSeqId) {
        this.revisionSeqId = revisionSeqId;
    }
public void setRevisedAmount(BigDecimal revisedAmount) {
        this.revisedAmount = revisedAmount;
    }
public void setAddDeleteFlag(Boolean addDeleteFlag) {
        this.addDeleteFlag = addDeleteFlag;
    }
public void setRevisionReason(String revisionReason) {
        this.revisionReason = revisionReason;
    }
}
