package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.GlJournal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlJournalRepository extends JpaRepository<GlJournal, Long> {
}
