package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyInvitationRoleAssoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyInvitationRoleAssocRepository extends JpaRepository<PartyInvitationRoleAssoc, Long> {
}