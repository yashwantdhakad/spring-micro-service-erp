package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyStatusRepository extends JpaRepository<PartyStatus, Long> {
}