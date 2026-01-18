package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductStoreRepository extends JpaRepository<ProductStore, Long> {
}