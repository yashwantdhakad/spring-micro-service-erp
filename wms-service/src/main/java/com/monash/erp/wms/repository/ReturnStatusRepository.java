package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ReturnStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReturnStatusRepository extends JpaRepository<ReturnStatus, Long> {
}