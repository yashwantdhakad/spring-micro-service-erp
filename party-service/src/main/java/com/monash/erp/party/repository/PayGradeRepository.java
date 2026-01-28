package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PayGrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayGradeRepository extends JpaRepository<PayGrade, Long> {
}