package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PayGrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayGradeRepository extends JpaRepository<PayGrade, Long> {
}