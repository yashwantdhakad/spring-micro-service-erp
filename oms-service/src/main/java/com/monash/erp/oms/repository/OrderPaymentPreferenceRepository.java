package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderPaymentPreference;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderPaymentPreferenceRepository extends JpaRepository<OrderPaymentPreference, Long> {
    List<OrderPaymentPreference> findByOrderId(String orderId);
}
