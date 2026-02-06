package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductFeatureGroupAppl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductFeatureGroupApplRepository extends JpaRepository<ProductFeatureGroupAppl, Long> {
    List<ProductFeatureGroupAppl> findByProductFeatureId(String productFeatureId);

    List<ProductFeatureGroupAppl> findByProductFeatureGroupId(String productFeatureGroupId);
}
