package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderItemAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemAttributeRepository extends JpaRepository<OrderItemAttribute, Long> {
}