package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.AcctgTransEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcctgTransEntryRepository extends JpaRepository<AcctgTransEntry, Long> {
}
