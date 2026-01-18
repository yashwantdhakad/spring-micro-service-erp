package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.StatusType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusTypeRepository extends JpaRepository<StatusType, Long> {
}
