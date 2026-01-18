package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ContentApproval;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentApprovalRepository extends JpaRepository<ContentApproval, Long> {
}