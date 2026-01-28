package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.PicklistStatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PicklistStatusHistoryRepository extends JpaRepository<PicklistStatusHistory, Long> {
}