package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProdCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdCatalogRepository extends JpaRepository<ProdCatalog, Long> {
}