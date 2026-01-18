package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.TaxAuthority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxAuthorityRepository extends JpaRepository<TaxAuthority, Long> {
}
