package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyGeoPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyGeoPointRepository extends JpaRepository<PartyGeoPoint, Long> {
}