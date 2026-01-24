package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.order.entity.OrderContentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderContentInfoRepository extends JpaRepository<OrderContentInfo, Long> {
    List<OrderContentInfo> findByOrderId(String orderId);
}
