package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.order.entity.OrderHeader;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Long> {
    Optional<OrderHeader> findByOrderId(String orderId);

    List<OrderHeader> findByStatusId(String statusId);

    Page<OrderHeader> findByOrderTypeId(String orderTypeId, Pageable pageable);

    Page<OrderHeader> findByOrderTypeIdAndOrderIdContainingIgnoreCaseOrOrderTypeIdAndOrderNameContainingIgnoreCase(
            String orderTypeId,
            String orderId,
            String orderTypeIdAgain,
            String orderName,
            Pageable pageable
    );
}
