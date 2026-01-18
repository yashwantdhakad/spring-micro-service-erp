package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductStoreCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductStoreCatalogRepository extends JpaRepository<ProductStoreCatalog, Long> {
}