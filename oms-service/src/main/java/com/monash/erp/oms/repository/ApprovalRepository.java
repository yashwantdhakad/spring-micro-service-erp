package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.Approval;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApprovalRepository extends JpaRepository<Approval, Long> {
}