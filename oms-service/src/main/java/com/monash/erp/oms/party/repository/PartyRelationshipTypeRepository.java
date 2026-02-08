package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyRelationshipType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRelationshipTypeRepository extends JpaRepository<PartyRelationshipType, Long> {
}