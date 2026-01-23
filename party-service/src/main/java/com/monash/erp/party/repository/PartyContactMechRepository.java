package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyContactMech;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PartyContactMechRepository extends JpaRepository<PartyContactMech, Long> {
    List<PartyContactMech> findByPartyId(String partyId);

    Optional<PartyContactMech> findByPartyIdAndContactMechId(String partyId, String contactMechId);

    void deleteByPartyIdAndContactMechId(String partyId, String contactMechId);
}
