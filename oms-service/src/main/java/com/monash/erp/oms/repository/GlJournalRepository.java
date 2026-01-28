package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.GlJournal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlJournalRepository extends JpaRepository<GlJournal, Long> {
}