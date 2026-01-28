package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.StatusType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusTypeRepository extends JpaRepository<StatusType, Long> {
}