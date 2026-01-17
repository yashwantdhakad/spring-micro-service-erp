package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.FinAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinAccountRepository extends JpaRepository<FinAccount, Long> {
}
