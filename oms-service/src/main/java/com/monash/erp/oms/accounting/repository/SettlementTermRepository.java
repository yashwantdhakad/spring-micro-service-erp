package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.SettlementTerm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SettlementTermRepository extends JpaRepository<SettlementTerm, Long> {
}
