package com.example.erp.party.ofbiz.repository;

import com.example.erp.party.ofbiz.domain.PartyStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyStatusRepository extends JpaRepository<PartyStatus, Long> {
}