package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.BillingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingAccountRepository extends JpaRepository<BillingAccount, Long> {
}