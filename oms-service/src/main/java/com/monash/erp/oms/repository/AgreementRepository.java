package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.Agreement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgreementRepository extends JpaRepository<Agreement, Long> {
}