package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.GlAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlAccountRepository extends JpaRepository<GlAccount, Long> {
}