package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FacilityRepository extends JpaRepository<Facility, Long> {
    Optional<Facility> findByFacilityId(String facilityId);
}
