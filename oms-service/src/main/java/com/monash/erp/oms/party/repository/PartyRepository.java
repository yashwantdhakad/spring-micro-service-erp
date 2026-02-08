package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PartyRepository extends JpaRepository<Party, Long> {
    Optional<Party> findByPartyId(String partyId);

    java.util.List<Party> findByPartyIdIn(java.util.List<String> partyIds);
}
