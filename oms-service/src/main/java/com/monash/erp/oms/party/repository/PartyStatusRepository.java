package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyStatusRepository extends JpaRepository<PartyStatus, Long> {
}