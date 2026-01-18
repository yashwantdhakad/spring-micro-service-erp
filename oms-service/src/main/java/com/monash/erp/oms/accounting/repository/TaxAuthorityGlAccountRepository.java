package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.TaxAuthorityGlAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxAuthorityGlAccountRepository extends JpaRepository<TaxAuthorityGlAccount, Long> {
}
