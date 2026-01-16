package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {
}