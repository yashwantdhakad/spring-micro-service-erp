package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyContactMechPurpose;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartyContactMechPurposeRepository extends JpaRepository<PartyContactMechPurpose, Long> {
    List<PartyContactMechPurpose> findByPartyId(String partyId);

    List<PartyContactMechPurpose> findByPartyIdAndContactMechId(String partyId, String contactMechId);

    void deleteByPartyIdAndContactMechId(String partyId, String contactMechId);
}
