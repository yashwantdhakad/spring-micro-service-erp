package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyIdentificationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyIdentificationTypeRepository extends JpaRepository<PartyIdentificationType, Long> {
}