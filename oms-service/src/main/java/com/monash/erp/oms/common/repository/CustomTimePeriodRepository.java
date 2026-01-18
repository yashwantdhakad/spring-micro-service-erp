package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.CustomTimePeriod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomTimePeriodRepository extends JpaRepository<CustomTimePeriod, Long> {
}
