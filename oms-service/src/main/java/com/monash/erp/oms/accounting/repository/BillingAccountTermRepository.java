package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.BillingAccountTerm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingAccountTermRepository extends JpaRepository<BillingAccountTerm, Long> {
}

