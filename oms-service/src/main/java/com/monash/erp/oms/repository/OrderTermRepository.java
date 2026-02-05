package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderTerm;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderTermRepository extends JpaRepository<OrderTerm, Long> {
    List<OrderTerm> findByOrderId(String orderId);
}
