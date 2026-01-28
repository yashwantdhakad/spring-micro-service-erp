package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductCategoryAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryAttributeRepository extends JpaRepository<ProductCategoryAttribute, Long> {
}