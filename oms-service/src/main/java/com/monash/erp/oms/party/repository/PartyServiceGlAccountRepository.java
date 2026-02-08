package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyGlAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyServiceGlAccountRepository extends JpaRepository<PartyGlAccount, Long> {
}