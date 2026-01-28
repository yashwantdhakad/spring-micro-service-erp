package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderItemChange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemChangeRepository extends JpaRepository<OrderItemChange, Long> {
}