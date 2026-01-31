package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartyRoleRepository extends JpaRepository<PartyRole, Long> {
    List<PartyRole> findByPartyId(String partyId);

    List<PartyRole> findByRoleTypeId(String roleTypeId);

    void deleteByPartyIdAndRoleTypeId(String partyId, String roleTypeId);
}
