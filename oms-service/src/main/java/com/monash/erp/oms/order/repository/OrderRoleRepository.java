package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.entity.OrderRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRoleRepository extends JpaRepository<OrderRole, Long> {
    List<OrderRole> findByOrderId(String orderId);

    List<OrderRole> findByOrderIdInAndRoleTypeId(List<String> orderIds, String roleTypeId);

    Optional<OrderRole> findByOrderIdAndRoleTypeId(String orderId, String roleTypeId);
}
