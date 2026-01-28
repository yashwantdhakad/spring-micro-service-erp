package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.TerminationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerminationTypeRepository extends JpaRepository<TerminationType, Long> {
}