package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductConfigRepository extends JpaRepository<ProductConfig, Long> {
}