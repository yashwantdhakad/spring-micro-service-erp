package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.GlAccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlAccountTypeRepository extends JpaRepository<GlAccountType, Long> {
}
