package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.order.entity.OrderItemBilling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemBillingRepository extends JpaRepository<OrderItemBilling, Long> {
}
