package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyRelationship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRelationshipRepository extends JpaRepository<PartyRelationship, Long> {
}