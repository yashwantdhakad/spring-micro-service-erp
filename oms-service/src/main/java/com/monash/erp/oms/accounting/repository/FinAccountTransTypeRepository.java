package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.FinAccountTransType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinAccountTransTypeRepository extends JpaRepository<FinAccountTransType, Long> {
}
