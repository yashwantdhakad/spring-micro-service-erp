package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyRelationshipType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRelationshipTypeRepository extends JpaRepository<PartyRelationshipType, Long> {
}