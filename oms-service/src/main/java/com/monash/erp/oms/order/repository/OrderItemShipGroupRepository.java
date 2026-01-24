package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.order.entity.OrderItemShipGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderItemShipGroupRepository extends JpaRepository<OrderItemShipGroup, Long> {
    List<OrderItemShipGroup> findByOrderId(String orderId);

    Optional<OrderItemShipGroup> findByOrderIdAndShipGroupSeqId(String orderId, String shipGroupSeqId);
}
