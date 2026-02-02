package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.entity.OrderContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderContentRepository extends JpaRepository<OrderContent, Long> {
    List<OrderContent> findByOrderId(String orderId);
}
