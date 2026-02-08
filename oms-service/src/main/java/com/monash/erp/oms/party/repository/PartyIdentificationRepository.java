package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyIdentification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyIdentificationRepository extends JpaRepository<PartyIdentification, Long> {
}