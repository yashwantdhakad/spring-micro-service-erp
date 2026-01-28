package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.EnumerationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnumerationTypeRepository extends JpaRepository<EnumerationType, Long> {
}