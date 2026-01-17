package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.BillingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingAccountRepository extends JpaRepository<BillingAccount, Long> {
}

