package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyAttributeRepository extends JpaRepository<PartyAttribute, Long> {
}