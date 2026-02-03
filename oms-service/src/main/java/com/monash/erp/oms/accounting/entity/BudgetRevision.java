package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class BudgetRevision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String budgetId;

    private String revisionSeqId;

    private LocalDateTime dateRevised;
public void setId(Long id) {
        this.id = id;
    }
public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }
public void setRevisionSeqId(String revisionSeqId) {
        this.revisionSeqId = revisionSeqId;
    }
public void setDateRevised(LocalDateTime dateRevised) {
        this.dateRevised = dateRevised;
    }
}
