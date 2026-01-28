package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderBlacklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderBlacklistRepository extends JpaRepository<OrderBlacklist, Long> {
}