package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.Deduction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeductionRepository extends JpaRepository<Deduction, Long> {
}
