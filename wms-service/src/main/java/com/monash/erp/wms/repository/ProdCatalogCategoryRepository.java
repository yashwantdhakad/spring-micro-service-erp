package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProdCatalogCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdCatalogCategoryRepository extends JpaRepository<ProdCatalogCategory, Long> {
}