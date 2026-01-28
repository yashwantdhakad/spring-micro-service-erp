package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyTaxInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyTaxInfoRepository extends JpaRepository<PartyTaxInfo, Long> {
}