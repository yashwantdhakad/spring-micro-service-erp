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
public class BudgetStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String budgetId;

    private String statusId;

    private LocalDateTime statusDate;

    private String comments;

    private String changeByUserLoginId;
public void setId(Long id) {
        this.id = id;
    }
public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setStatusDate(LocalDateTime statusDate) {
        this.statusDate = statusDate;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setChangeByUserLoginId(String changeByUserLoginId) {
        this.changeByUserLoginId = changeByUserLoginId;
    }
}
