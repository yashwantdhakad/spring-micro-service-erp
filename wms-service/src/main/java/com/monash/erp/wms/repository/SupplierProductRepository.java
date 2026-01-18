package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.SupplierProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierProductRepository extends JpaRepository<SupplierProduct, Long> {
}