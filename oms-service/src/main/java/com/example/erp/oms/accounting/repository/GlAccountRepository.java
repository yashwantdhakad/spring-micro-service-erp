package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.GlAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlAccountRepository extends JpaRepository<GlAccount, Long> {
}
