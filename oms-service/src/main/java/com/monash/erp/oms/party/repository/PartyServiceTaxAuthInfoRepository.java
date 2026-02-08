package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyTaxAuthInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyServiceTaxAuthInfoRepository extends JpaRepository<PartyTaxAuthInfo, Long> {
}