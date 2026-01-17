package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.FinAccountTrans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinAccountTransRepository extends JpaRepository<FinAccountTrans, Long> {
}
