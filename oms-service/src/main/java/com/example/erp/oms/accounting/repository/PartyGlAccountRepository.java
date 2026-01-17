package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PartyGlAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyGlAccountRepository extends JpaRepository<PartyGlAccount, Long> {
}
