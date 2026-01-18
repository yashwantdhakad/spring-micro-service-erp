package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductCategoryType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryTypeRepository extends JpaRepository<ProductCategoryType, Long> {
}