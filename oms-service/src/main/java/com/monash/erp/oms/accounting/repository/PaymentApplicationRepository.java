package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentApplicationRepository extends JpaRepository<PaymentApplication, Long> {
}
