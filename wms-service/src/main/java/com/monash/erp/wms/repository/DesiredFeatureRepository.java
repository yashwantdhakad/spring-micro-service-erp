package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.DesiredFeature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesiredFeatureRepository extends JpaRepository<DesiredFeature, Long> {
}