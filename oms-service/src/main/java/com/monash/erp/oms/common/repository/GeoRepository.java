package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.Geo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeoRepository extends JpaRepository<Geo, Long> {
}
