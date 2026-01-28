package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderAttributeRepository extends JpaRepository<OrderAttribute, Long> {
}