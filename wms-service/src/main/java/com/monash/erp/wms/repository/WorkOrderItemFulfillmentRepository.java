package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.WorkOrderItemFulfillment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkOrderItemFulfillmentRepository extends JpaRepository<WorkOrderItemFulfillment, Long> {
}