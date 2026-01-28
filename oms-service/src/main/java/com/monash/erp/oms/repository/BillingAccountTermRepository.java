package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.BillingAccountTerm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingAccountTermRepository extends JpaRepository<BillingAccountTerm, Long> {
}