package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.BudgetReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetReviewRepository extends JpaRepository<BudgetReview, Long> {
}

