package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyServiceRateRepository extends JpaRepository<PartyRate, Long> {
}