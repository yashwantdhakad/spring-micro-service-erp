package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.BillingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingAccountRepository extends JpaRepository<BillingAccount, Long> {
}

