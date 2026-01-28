package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.QuoteNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteNoteRepository extends JpaRepository<QuoteNote, Long> {
}