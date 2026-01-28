package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.SystemProperty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemPropertyRepository extends JpaRepository<SystemProperty, Long> {
}