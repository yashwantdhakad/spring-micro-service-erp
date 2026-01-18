package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductContentRepository extends JpaRepository<ProductContent, Long> {
}