package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.FacilityLocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacilityLocationRepository extends JpaRepository<FacilityLocation, Long> {
    List<FacilityLocation> findByFacilityId(String facilityId);
}
