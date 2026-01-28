package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.CustRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustRequestRepository extends JpaRepository<CustRequest, Long> {
}