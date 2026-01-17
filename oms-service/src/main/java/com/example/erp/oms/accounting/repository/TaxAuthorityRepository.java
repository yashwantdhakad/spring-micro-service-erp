package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.TaxAuthority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxAuthorityRepository extends JpaRepository<TaxAuthority, Long> {
}
