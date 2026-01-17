package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PartyTaxAuthInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyTaxAuthInfoRepository extends JpaRepository<PartyTaxAuthInfo, Long> {
}
