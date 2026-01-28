package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderBlacklistType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderBlacklistTypeRepository extends JpaRepository<OrderBlacklistType, Long> {
}