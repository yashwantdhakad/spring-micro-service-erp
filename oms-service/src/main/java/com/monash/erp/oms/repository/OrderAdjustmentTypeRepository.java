package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderAdjustmentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderAdjustmentTypeRepository extends JpaRepository<OrderAdjustmentType, Long> {
}