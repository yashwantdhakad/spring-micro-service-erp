package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.TaxAuthorityCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxAuthorityCategoryRepository extends JpaRepository<TaxAuthorityCategory, Long> {
}