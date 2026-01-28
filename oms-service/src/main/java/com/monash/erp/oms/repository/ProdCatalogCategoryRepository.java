package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.ProdCatalogCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdCatalogCategoryRepository extends JpaRepository<ProdCatalogCategory, Long> {
}