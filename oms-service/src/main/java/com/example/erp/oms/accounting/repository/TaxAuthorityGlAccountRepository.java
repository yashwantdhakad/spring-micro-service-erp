package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.TaxAuthorityGlAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxAuthorityGlAccountRepository extends JpaRepository<TaxAuthorityGlAccount, Long> {
}
