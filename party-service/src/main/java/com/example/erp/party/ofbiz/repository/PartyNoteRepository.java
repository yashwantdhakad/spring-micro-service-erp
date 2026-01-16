package com.example.erp.party.ofbiz.repository;

import com.example.erp.party.ofbiz.domain.PartyNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyNoteRepository extends JpaRepository<PartyNote, Long> {
}