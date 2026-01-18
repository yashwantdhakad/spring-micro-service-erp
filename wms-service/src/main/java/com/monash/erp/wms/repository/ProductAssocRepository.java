package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductAssoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductAssocRepository extends JpaRepository<ProductAssoc, Long> {
}