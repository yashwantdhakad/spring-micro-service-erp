package com.example.erp.oms.common.repository;

import com.example.erp.oms.common.domain.Geo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeoRepository extends JpaRepository<Geo, Long> {
}
