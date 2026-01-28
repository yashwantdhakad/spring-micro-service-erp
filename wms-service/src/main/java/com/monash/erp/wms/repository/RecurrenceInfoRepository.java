package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.RecurrenceInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecurrenceInfoRepository extends JpaRepository<RecurrenceInfo, Long> {
}