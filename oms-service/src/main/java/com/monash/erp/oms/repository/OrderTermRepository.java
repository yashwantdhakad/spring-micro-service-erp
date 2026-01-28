package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderTerm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderTermRepository extends JpaRepository<OrderTerm, Long> {
}