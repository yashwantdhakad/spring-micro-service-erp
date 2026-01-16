package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.Lot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LotRepository extends JpaRepository<Lot, Long> {
}