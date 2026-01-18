package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.VarianceReason;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VarianceReasonRepository extends JpaRepository<VarianceReason, Long> {
}