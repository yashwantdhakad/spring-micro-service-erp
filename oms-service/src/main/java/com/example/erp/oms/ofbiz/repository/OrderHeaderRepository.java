package com.example.erp.oms.ofbiz.repository;

import com.example.erp.oms.ofbiz.domain.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Long> {
}
