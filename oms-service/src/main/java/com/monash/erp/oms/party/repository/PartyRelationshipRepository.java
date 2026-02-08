package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyRelationship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRelationshipRepository extends JpaRepository<PartyRelationship, Long> {
}