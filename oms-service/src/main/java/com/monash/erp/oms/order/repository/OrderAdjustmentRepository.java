package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.entity.OrderAdjustment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderAdjustmentRepository extends JpaRepository<OrderAdjustment, Long> {
    List<OrderAdjustment> findByOrderId(String orderId);
}
