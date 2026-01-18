package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.Deduction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeductionRepository extends JpaRepository<Deduction, Long> {
}
