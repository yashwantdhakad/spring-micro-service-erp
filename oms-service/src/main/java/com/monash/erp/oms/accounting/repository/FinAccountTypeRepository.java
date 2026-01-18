package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.FinAccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinAccountTypeRepository extends JpaRepository<FinAccountType, Long> {
}
