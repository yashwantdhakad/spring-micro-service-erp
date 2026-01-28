package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderLabel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLabelRepository extends JpaRepository<OrderLabel, Long> {
}