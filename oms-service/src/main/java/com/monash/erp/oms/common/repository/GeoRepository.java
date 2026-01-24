package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.Geo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GeoRepository extends JpaRepository<Geo, Long> {
    Optional<Geo> findByGeoId(String geoId);
}
