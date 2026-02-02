package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Long> {
    List<OrderStatus> findByOrderIdOrderByStatusDatetimeAsc(String orderId);
}
