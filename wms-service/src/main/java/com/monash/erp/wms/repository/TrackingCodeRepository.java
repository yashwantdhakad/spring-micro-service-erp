package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.TrackingCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackingCodeRepository extends JpaRepository<TrackingCode, Long> {
}