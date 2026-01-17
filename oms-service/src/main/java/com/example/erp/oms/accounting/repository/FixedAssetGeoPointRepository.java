package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.FixedAssetGeoPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetGeoPointRepository extends JpaRepository<FixedAssetGeoPoint, Long> {
}
