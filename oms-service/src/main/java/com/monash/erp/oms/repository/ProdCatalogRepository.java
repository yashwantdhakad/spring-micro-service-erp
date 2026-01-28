package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.ProdCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdCatalogRepository extends JpaRepository<ProdCatalog, Long> {
}