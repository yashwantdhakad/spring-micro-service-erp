package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ApiGatewayRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiGatewayRequestRepository extends JpaRepository<ApiGatewayRequest, Long> {
}