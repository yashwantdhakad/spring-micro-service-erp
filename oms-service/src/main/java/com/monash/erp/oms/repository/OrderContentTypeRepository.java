package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderContentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderContentTypeRepository extends JpaRepository<OrderContentType, Long> {
}