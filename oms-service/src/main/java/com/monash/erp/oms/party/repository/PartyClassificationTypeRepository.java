package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyClassificationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyClassificationTypeRepository extends JpaRepository<PartyClassificationType, Long> {
}