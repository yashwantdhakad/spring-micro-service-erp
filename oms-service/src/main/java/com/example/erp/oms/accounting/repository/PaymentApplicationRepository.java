package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentApplicationRepository extends JpaRepository<PaymentApplication, Long> {
}
