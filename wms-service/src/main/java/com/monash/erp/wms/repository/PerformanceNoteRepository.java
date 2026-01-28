package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.PerformanceNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerformanceNoteRepository extends JpaRepository<PerformanceNote, Long> {
}