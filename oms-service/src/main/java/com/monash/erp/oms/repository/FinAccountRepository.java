package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.FinAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinAccountRepository extends JpaRepository<FinAccount, Long> {
}