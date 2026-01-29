package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.order.entity.OrderContactMech;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderContactMechRepository extends JpaRepository<OrderContactMech, Long> {
    List<OrderContactMech> findByOrderId(String orderId);
    List<OrderContactMech> findByOrderIdAndContactMechPurposeTypeId(String orderId, String contactMechPurposeTypeId);
}
