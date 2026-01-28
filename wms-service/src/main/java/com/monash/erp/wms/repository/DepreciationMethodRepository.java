package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.DepreciationMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepreciationMethodRepository extends JpaRepository<DepreciationMethod, Long> {
}