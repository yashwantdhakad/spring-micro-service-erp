package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.FinAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinAccountRepository extends JpaRepository<FinAccount, Long> {
}
