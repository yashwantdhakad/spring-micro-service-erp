package com.example.erp.oms.common.repository;

import com.example.erp.oms.common.domain.GeoPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeoPointRepository extends JpaRepository<GeoPoint, Long> {
}
