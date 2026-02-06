package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.FacilityLocation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FacilityLocationRepository extends JpaRepository<FacilityLocation, Long> {
    List<FacilityLocation> findByFacilityId(String facilityId);

    @Query("""
            SELECT fl
            FROM FacilityLocation fl
            WHERE fl.facilityId = :facilityId
              AND (:locationSeqId IS NULL OR LOWER(fl.locationSeqId) LIKE LOWER(CONCAT('%', :locationSeqId, '%')))
              AND (:locationName IS NULL OR LOWER(fl.areaId) LIKE LOWER(CONCAT('%', :locationName, '%')))
            """)
    Page<FacilityLocation> findByFacilityIdWithFilters(
            @Param("facilityId") String facilityId,
            @Param("locationSeqId") String locationSeqId,
            @Param("locationName") String locationName,
            Pageable pageable
    );
}
