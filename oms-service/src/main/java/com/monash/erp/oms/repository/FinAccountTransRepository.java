package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.FinAccountTrans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinAccountTransRepository extends JpaRepository<FinAccountTrans, Long> {
}