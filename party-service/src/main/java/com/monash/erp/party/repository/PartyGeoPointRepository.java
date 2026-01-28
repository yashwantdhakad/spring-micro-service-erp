package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyGeoPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyGeoPointRepository extends JpaRepository<PartyGeoPoint, Long> {
}