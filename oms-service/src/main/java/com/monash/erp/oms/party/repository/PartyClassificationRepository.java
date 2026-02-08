package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyClassification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyClassificationRepository extends JpaRepository<PartyClassification, Long> {
}