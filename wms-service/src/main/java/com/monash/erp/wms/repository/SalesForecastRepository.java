package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.SalesForecast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesForecastRepository extends JpaRepository<SalesForecast, Long> {
}