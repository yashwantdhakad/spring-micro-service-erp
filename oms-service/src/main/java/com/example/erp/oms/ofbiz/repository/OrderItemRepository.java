package com.example.erp.oms.ofbiz.repository;

import com.example.erp.oms.ofbiz.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
