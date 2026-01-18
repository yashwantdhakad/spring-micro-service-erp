package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.FixedAssetGeoPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetGeoPointRepository extends JpaRepository<FixedAssetGeoPoint, Long> {
}
