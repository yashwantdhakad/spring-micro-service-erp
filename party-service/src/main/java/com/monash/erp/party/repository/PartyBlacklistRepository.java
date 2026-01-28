package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyBlacklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyBlacklistRepository extends JpaRepository<PartyBlacklist, Long> {
}