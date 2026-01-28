package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductDimension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDimensionRepository extends JpaRepository<ProductDimension, Long> {
}