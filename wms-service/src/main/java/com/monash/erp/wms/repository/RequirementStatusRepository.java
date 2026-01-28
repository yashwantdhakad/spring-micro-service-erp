package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.RequirementStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequirementStatusRepository extends JpaRepository<RequirementStatus, Long> {
}