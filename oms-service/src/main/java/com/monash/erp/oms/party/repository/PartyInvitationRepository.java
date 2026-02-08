package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyInvitation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyInvitationRepository extends JpaRepository<PartyInvitation, Long> {
}