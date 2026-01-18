package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyClassificationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyClassificationTypeRepository extends JpaRepository<PartyClassificationType, Long> {
}