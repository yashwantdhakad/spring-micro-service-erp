package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyBlacklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyBlacklistRepository extends JpaRepository<PartyBlacklist, Long> {
}