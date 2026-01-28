package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemTypeRepository extends JpaRepository<OrderItemType, Long> {
}