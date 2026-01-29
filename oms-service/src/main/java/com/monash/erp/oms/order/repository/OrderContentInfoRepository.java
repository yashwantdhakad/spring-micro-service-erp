package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.order.entity.OrderContentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderContentInfoRepository extends JpaRepository<OrderContentInfo, Long> {
    List<OrderContentInfo> findByOrderId(String orderId);

    Optional<OrderContentInfo> findByOrderIdAndContentId(String orderId, String contentId);
}
