package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.IntacctRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntacctRequestRepository extends JpaRepository<IntacctRequest, Long> {
}