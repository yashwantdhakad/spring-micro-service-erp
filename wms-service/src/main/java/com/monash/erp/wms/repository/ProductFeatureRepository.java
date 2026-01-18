package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductFeature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductFeatureRepository extends JpaRepository<ProductFeature, Long> {
}