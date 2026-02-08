package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductFacility;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductFacilityRepository extends JpaRepository<ProductFacility, Long> {
    List<ProductFacility> findByProductId(String productId);
}