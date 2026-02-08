package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyFixedAssetAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyServiceFixedAssetAssignmentRepository extends JpaRepository<PartyFixedAssetAssignment, Long> {
}