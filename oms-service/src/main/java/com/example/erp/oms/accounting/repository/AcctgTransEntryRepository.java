package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.AcctgTransEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcctgTransEntryRepository extends JpaRepository<AcctgTransEntry, Long> {
}
