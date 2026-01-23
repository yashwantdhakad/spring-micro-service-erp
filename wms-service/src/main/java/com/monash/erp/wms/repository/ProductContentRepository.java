package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductContentRepository extends JpaRepository<ProductContent, Long> {
    List<ProductContent> findByProductId(String productId);
}
