package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.ProductAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductAttributeRepository extends JpaRepository<ProductAttribute, Long> {
}