package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.TerminationReason;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerminationReasonRepository extends JpaRepository<TerminationReason, Long> {
}