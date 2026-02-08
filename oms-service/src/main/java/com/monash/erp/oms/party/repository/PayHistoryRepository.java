package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PayHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayHistoryRepository extends JpaRepository<PayHistory, Long> {
}