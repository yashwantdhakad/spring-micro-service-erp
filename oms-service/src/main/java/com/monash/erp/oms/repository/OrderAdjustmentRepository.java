package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderAdjustment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderAdjustmentRepository extends JpaRepository<OrderAdjustment, Long> {
}