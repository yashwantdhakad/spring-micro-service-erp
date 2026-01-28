package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.TrackingCodeOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackingCodeOrderRepository extends JpaRepository<TrackingCodeOrder, Long> {
}