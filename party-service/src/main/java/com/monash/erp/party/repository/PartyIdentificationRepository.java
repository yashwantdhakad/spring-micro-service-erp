package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyIdentification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyIdentificationRepository extends JpaRepository<PartyIdentification, Long> {
}