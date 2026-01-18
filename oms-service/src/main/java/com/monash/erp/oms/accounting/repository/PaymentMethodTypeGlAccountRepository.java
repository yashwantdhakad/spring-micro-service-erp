package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentMethodTypeGlAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodTypeGlAccountRepository extends JpaRepository<PaymentMethodTypeGlAccount, Long> {
}
