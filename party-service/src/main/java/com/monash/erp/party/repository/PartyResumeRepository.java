package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyResume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyResumeRepository extends JpaRepository<PartyResume, Long> {
}