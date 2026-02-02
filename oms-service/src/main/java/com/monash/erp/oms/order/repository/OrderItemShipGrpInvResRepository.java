package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.entity.OrderItemShipGrpInvRes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface OrderItemShipGrpInvResRepository extends JpaRepository<OrderItemShipGrpInvRes, Long> {
    List<OrderItemShipGrpInvRes> findByOrderId(String orderId);

    List<OrderItemShipGrpInvRes> findByOrderIdIn(List<String> orderIds);

    List<OrderItemShipGrpInvRes> findByInventoryItemId(String inventoryItemId);

    List<OrderItemShipGrpInvRes> findByQuantityNotAvailableGreaterThan(BigDecimal quantity);

    void deleteByOrderId(String orderId);
}
