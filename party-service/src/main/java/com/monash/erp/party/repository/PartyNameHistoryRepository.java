package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyNameHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyNameHistoryRepository extends JpaRepository<PartyNameHistory, Long> {
}