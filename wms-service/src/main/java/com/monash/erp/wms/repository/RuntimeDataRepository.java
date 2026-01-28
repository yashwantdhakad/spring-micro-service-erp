package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.RuntimeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RuntimeDataRepository extends JpaRepository<RuntimeData, Long> {
}