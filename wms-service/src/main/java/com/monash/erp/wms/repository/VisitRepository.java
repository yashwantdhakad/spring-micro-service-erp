package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Long> {
}