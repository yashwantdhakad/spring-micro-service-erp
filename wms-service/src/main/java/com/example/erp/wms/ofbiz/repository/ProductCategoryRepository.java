package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}