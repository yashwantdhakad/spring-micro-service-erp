package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyNote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartyNoteRepository extends JpaRepository<PartyNote, Long> {
    List<PartyNote> findByPartyId(String partyId);
}
