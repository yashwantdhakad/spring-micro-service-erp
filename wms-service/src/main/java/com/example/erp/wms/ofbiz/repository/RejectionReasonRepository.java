package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.RejectionReason;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RejectionReasonRepository extends JpaRepository<RejectionReason, Long> {
}