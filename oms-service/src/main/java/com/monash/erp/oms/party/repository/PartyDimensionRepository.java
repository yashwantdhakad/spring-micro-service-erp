package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyDimension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyDimensionRepository extends JpaRepository<PartyDimension, Long> {
}