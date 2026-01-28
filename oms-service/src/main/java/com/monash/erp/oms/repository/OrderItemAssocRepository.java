package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderItemAssoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemAssocRepository extends JpaRepository<OrderItemAssoc, Long> {
}