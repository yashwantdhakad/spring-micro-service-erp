package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyAttributeRepository extends JpaRepository<PartyAttribute, Long> {
}