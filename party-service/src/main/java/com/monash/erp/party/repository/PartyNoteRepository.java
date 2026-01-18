package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyNoteRepository extends JpaRepository<PartyNote, Long> {
}