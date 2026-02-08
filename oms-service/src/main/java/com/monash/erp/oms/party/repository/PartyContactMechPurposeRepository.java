package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyContactMechPurpose;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartyContactMechPurposeRepository extends JpaRepository<PartyContactMechPurpose, Long> {
    List<PartyContactMechPurpose> findByPartyId(String partyId);

    List<PartyContactMechPurpose> findByPartyIdAndContactMechId(String partyId, String contactMechId);

    List<PartyContactMechPurpose> findByPartyIdAndContactMechPurposeTypeIdAndThruDateIsNull(
            String partyId,
            String contactMechPurposeTypeId
    );

    void deleteByPartyIdAndContactMechId(String partyId, String contactMechId);
}
