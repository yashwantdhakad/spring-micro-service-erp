package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.GlJournal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlJournalRepository extends JpaRepository<GlJournal, Long> {
}
