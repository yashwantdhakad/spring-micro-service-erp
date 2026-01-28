package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.RecurrenceRule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecurrenceRuleRepository extends JpaRepository<RecurrenceRule, Long> {
}