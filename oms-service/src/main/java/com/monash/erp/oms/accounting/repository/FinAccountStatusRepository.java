package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.FinAccountStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinAccountStatusRepository extends JpaRepository<FinAccountStatus, Long> {
}
