package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.FacilityContactMech;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacilityContactMechRepository extends JpaRepository<FacilityContactMech, Long> {
    List<FacilityContactMech> findByFacilityId(String facilityId);
}
