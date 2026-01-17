package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.BudgetReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetReviewRepository extends JpaRepository<BudgetReview, Long> {
}
