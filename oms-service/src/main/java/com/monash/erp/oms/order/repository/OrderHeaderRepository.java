package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.order.entity.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Long> {
}
