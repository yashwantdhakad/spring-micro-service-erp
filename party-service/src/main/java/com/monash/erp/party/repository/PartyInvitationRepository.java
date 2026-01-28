package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyInvitation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyInvitationRepository extends JpaRepository<PartyInvitation, Long> {
}