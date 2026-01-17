package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.SettlementTerm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SettlementTermRepository extends JpaRepository<SettlementTerm, Long> {
}
