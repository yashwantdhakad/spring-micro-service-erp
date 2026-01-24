package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByOrderId(String orderId);

    Optional<OrderItem> findByOrderIdAndOrderItemSeqId(String orderId, String orderItemSeqId);
}
