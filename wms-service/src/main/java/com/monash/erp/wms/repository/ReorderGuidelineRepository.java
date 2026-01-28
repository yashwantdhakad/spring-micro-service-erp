package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ReorderGuideline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReorderGuidelineRepository extends JpaRepository<ReorderGuideline, Long> {
}