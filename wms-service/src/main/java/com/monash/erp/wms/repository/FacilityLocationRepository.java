package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.FacilityLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityLocationRepository extends JpaRepository<FacilityLocation, Long> {
}