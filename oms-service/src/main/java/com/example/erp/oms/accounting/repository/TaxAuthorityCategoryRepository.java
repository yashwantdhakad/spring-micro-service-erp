package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.TaxAuthorityCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxAuthorityCategoryRepository extends JpaRepository<TaxAuthorityCategory, Long> {
}
