package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.CurrencyDimension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyDimensionRepository extends JpaRepository<CurrencyDimension, Long> {
}