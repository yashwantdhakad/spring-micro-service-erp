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
public class BudgetReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String budgetId;

    private String budgetReviewId;

    private String partyId;

    private String budgetReviewResultTypeId;

    private LocalDateTime reviewDate;
public void setId(Long id) {
        this.id = id;
    }
public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }
public void setBudgetReviewId(String budgetReviewId) {
        this.budgetReviewId = budgetReviewId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setBudgetReviewResultTypeId(String budgetReviewResultTypeId) {
        this.budgetReviewResultTypeId = budgetReviewResultTypeId;
    }
public void setReviewDate(LocalDateTime reviewDate) {
        this.reviewDate = reviewDate;
    }
}
