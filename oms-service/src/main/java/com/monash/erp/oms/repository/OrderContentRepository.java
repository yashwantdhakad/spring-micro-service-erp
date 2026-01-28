package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderContentRepository extends JpaRepository<OrderContent, Long> {
}