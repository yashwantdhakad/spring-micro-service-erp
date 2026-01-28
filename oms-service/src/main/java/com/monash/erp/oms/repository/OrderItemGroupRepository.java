package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderItemGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemGroupRepository extends JpaRepository<OrderItemGroup, Long> {
}