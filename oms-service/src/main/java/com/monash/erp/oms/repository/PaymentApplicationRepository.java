package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.PaymentApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentApplicationRepository extends JpaRepository<PaymentApplication, Long> {
}