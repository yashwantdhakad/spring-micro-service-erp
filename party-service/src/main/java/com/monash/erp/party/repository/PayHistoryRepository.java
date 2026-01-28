package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PayHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayHistoryRepository extends JpaRepository<PayHistory, Long> {
}