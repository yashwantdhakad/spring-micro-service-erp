package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.DeductionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeductionTypeRepository extends JpaRepository<DeductionType, Long> {
}
