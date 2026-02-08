package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductFacilityLocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductFacilityLocationRepository extends JpaRepository<ProductFacilityLocation, Long> {
    List<ProductFacilityLocation> findByProductId(String productId);

    List<ProductFacilityLocation> findByFacilityId(String facilityId);
}