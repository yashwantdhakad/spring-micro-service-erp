package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.RequirementType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequirementTypeRepository extends JpaRepository<RequirementType, Long> {
}