package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.RequirementAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequirementAttributeRepository extends JpaRepository<RequirementAttribute, Long> {
}