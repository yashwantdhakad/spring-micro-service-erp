package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.FinAccountStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinAccountStatusRepository extends JpaRepository<FinAccountStatus, Long> {
}
