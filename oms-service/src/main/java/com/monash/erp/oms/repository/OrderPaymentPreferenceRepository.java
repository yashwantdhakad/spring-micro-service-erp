package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderPaymentPreference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderPaymentPreferenceRepository extends JpaRepository<OrderPaymentPreference, Long> {
}