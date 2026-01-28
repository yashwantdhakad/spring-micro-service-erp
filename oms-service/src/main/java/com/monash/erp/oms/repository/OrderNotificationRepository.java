package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderNotification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderNotificationRepository extends JpaRepository<OrderNotification, Long> {
}