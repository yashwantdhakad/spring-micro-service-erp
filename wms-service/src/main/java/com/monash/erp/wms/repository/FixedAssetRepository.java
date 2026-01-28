package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.FixedAsset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetRepository extends JpaRepository<FixedAsset, Long> {
}