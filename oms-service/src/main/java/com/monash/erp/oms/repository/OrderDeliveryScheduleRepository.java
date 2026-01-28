package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderDeliverySchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDeliveryScheduleRepository extends JpaRepository<OrderDeliverySchedule, Long> {
}