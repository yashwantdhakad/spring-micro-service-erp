package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.SystemProperty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemPropertyRepository extends JpaRepository<SystemProperty, Long> {
}
