package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyTypeRepository extends JpaRepository<PartyType, Long> {
}