package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.AcctgTransEntryType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcctgTransEntryTypeRepository extends JpaRepository<AcctgTransEntryType, Long> {
}

