package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.FixedAssetProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetProductRepository extends JpaRepository<FixedAssetProduct, Long> {
}