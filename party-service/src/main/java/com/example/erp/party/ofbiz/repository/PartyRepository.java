package com.example.erp.party.ofbiz.repository;

import com.example.erp.party.ofbiz.domain.Party;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<Party, Long> {
}