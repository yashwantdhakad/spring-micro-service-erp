package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.CustRequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustRequestStatusRepository extends JpaRepository<CustRequestStatus, Long> {
}