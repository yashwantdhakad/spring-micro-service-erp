package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.FinAccountAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinAccountAuthRepository extends JpaRepository<FinAccountAuth, Long> {
}
