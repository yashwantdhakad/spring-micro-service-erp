package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.CustomTimePeriod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomTimePeriodRepository extends JpaRepository<CustomTimePeriod, Long> {
}