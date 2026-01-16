package com.example.erp.party.ofbiz.repository;

import com.example.erp.party.ofbiz.domain.PartyIdentification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyIdentificationRepository extends JpaRepository<PartyIdentification, Long> {
}