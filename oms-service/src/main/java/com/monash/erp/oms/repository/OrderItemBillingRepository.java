package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderItemBilling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemBillingRepository extends JpaRepository<OrderItemBilling, Long> {
}