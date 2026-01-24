package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.order.entity.OrderItemShipGroupAssoc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemShipGroupAssocRepository extends JpaRepository<OrderItemShipGroupAssoc, Long> {
    List<OrderItemShipGroupAssoc> findByOrderId(String orderId);

    List<OrderItemShipGroupAssoc> findByOrderIdAndShipGroupSeqId(String orderId, String shipGroupSeqId);
}
