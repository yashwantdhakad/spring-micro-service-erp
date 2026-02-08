package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.Employment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploymentRepository extends JpaRepository<Employment, Long> {
}