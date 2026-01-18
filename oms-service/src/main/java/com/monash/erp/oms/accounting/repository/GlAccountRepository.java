package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.GlAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlAccountRepository extends JpaRepository<GlAccount, Long> {
}
