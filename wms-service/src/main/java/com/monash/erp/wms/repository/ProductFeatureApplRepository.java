package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductFeatureAppl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductFeatureApplRepository extends JpaRepository<ProductFeatureAppl, Long> {
    List<ProductFeatureAppl> findByProductId(String productId);

    List<ProductFeatureAppl> findByProductFeatureId(String productFeatureId);
}
