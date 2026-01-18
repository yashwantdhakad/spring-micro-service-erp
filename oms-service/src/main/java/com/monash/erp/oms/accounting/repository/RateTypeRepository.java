package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.RateType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateTypeRepository extends JpaRepository<RateType, Long> {
}
