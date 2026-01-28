package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.TaxAuthority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxAuthorityRepository extends JpaRepository<TaxAuthority, Long> {
}