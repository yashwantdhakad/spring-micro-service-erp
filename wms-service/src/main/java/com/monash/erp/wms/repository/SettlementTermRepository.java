package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.SettlementTerm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SettlementTermRepository extends JpaRepository<SettlementTerm, Long> {
}