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
public class BudgetReviewResultType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String budgetReviewResultTypeId;

    private String description;

    private String comments;
public void setId(Long id) {
        this.id = id;
    }
public void setBudgetReviewResultTypeId(String budgetReviewResultTypeId) {
        this.budgetReviewResultTypeId = budgetReviewResultTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
}
