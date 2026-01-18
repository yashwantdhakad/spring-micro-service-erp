package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.PicklistStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PicklistStatusRepository extends JpaRepository<PicklistStatus, Long> {
}