package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Deduction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeductionRepository extends JpaRepository<Deduction, Long> {
}