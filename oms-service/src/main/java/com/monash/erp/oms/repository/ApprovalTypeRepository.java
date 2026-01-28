package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.ApprovalType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApprovalTypeRepository extends JpaRepository<ApprovalType, Long> {
}