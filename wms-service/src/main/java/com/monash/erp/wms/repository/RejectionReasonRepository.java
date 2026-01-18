package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.RejectionReason;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RejectionReasonRepository extends JpaRepository<RejectionReason, Long> {
}