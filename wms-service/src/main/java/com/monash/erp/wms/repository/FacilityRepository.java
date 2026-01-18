package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepository extends JpaRepository<Facility, Long> {
}