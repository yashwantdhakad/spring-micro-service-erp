package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyTypeRepository extends JpaRepository<PartyType, Long> {
}