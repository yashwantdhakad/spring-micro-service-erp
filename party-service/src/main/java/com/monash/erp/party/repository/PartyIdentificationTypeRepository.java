package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyIdentificationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyIdentificationTypeRepository extends JpaRepository<PartyIdentificationType, Long> {
}