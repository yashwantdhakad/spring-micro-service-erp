package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.order.entity.OrderContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderContentRepository extends JpaRepository<OrderContent, Long> {
}
