package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PartyGlAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyGlAccountRepository extends JpaRepository<PartyGlAccount, Long> {
}
