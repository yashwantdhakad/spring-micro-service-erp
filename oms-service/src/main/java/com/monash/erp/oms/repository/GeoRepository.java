package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.Geo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeoRepository extends JpaRepository<Geo, Long> {
}