package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.AcctgTransType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcctgTransTypeRepository extends JpaRepository<AcctgTransType, Long> {
}
