package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.BillingAccountTerm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingAccountTermRepository extends JpaRepository<BillingAccountTerm, Long> {
}
