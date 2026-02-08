package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyTaxInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyTaxInfoRepository extends JpaRepository<PartyTaxInfo, Long> {
}