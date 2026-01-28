package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyTaxAuthInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyTaxAuthInfoRepository extends JpaRepository<PartyTaxAuthInfo, Long> {
}