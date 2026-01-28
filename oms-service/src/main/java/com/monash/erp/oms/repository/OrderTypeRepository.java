package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderTypeRepository extends JpaRepository<OrderType, Long> {
}