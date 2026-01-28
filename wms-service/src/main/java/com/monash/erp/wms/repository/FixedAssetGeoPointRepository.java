package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.FixedAssetGeoPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetGeoPointRepository extends JpaRepository<FixedAssetGeoPoint, Long> {
}