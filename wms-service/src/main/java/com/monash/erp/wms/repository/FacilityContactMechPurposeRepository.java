package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.FacilityContactMechPurpose;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacilityContactMechPurposeRepository extends JpaRepository<FacilityContactMechPurpose, Long> {
    List<FacilityContactMechPurpose> findByFacilityId(String facilityId);
}
