package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyDimension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyDimensionRepository extends JpaRepository<PartyDimension, Long> {
}