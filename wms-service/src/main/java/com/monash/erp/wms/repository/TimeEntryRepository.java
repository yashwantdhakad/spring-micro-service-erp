package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.TimeEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeEntryRepository extends JpaRepository<TimeEntry, Long> {
}