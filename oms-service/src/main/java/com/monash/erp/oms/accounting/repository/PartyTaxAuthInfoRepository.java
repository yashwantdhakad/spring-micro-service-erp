package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PartyTaxAuthInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyTaxAuthInfoRepository extends JpaRepository<PartyTaxAuthInfo, Long> {
}
