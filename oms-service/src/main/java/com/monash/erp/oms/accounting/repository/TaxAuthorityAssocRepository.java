package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.TaxAuthorityAssoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxAuthorityAssocRepository extends JpaRepository<TaxAuthorityAssoc, Long> {
}
