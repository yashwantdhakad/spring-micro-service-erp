package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Requirement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequirementRepository extends JpaRepository<Requirement, Long> {
}