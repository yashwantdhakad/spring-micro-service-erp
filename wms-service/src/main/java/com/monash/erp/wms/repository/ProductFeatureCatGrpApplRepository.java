package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductFeatureCatGrpAppl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductFeatureCatGrpApplRepository extends JpaRepository<ProductFeatureCatGrpAppl, Long> {
    List<ProductFeatureCatGrpAppl> findByProductFeatureGroupId(String productFeatureGroupId);
}
