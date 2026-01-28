package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.AcctgTransEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcctgTransEntryRepository extends JpaRepository<AcctgTransEntry, Long> {
}