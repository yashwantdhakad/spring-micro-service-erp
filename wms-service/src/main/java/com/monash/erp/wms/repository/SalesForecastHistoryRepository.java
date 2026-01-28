package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.SalesForecastHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesForecastHistoryRepository extends JpaRepository<SalesForecastHistory, Long> {
}