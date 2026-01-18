package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Lot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LotRepository extends JpaRepository<Lot, Long> {
}