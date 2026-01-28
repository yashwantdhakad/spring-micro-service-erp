package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyInvitationRoleAssoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyInvitationRoleAssocRepository extends JpaRepository<PartyInvitationRoleAssoc, Long> {
}