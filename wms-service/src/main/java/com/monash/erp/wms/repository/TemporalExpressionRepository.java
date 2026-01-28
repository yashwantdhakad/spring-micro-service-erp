package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.TemporalExpression;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemporalExpressionRepository extends JpaRepository<TemporalExpression, Long> {
}