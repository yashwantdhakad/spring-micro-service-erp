package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.TaxGatewayConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxGatewayConfigRepository extends JpaRepository<TaxGatewayConfig, Long> {
}