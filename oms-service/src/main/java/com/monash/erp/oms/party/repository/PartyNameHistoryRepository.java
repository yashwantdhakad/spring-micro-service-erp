package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyNameHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyNameHistoryRepository extends JpaRepository<PartyNameHistory, Long> {
}