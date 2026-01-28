package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.CustomMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomMethodRepository extends JpaRepository<CustomMethod, Long> {
}