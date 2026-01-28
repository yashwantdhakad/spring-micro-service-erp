package com.monash.erp.party.repository;

import com.monash.erp.party.entity.Employment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploymentRepository extends JpaRepository<Employment, Long> {
}