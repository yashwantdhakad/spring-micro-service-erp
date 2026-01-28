package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.Enumeration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnumerationRepository extends JpaRepository<Enumeration, Long> {
}