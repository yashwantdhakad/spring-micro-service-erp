package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ReturnReason;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReturnReasonRepository extends JpaRepository<ReturnReason, Long> {
}