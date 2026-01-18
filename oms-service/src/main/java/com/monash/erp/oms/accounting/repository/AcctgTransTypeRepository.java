package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.AcctgTransType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcctgTransTypeRepository extends JpaRepository<AcctgTransType, Long> {
}

