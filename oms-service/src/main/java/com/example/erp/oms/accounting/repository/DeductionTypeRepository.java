package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.DeductionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeductionTypeRepository extends JpaRepository<DeductionType, Long> {
}
