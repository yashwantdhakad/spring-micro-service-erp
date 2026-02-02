package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.entity.OrderItemBilling;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemBillingRepository extends JpaRepository<OrderItemBilling, Long> {
    List<OrderItemBilling> findByOrderId(String orderId);
}
