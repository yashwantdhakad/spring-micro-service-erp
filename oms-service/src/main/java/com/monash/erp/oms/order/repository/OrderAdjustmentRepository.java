package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.order.entity.OrderAdjustment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderAdjustmentRepository extends JpaRepository<OrderAdjustment, Long> {
}
