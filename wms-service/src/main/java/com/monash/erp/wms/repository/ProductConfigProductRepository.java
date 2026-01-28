package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductConfigProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductConfigProductRepository extends JpaRepository<ProductConfigProduct, Long> {
}