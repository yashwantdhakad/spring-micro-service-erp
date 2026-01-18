package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.TaxAuthorityCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxAuthorityCategoryRepository extends JpaRepository<TaxAuthorityCategory, Long> {
}
