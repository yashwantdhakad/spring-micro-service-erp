package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderItemPriceInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemPriceInfoRepository extends JpaRepository<OrderItemPriceInfo, Long> {
}