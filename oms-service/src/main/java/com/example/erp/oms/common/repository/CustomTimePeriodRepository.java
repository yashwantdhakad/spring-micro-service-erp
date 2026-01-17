package com.example.erp.oms.common.repository;

import com.example.erp.oms.common.domain.CustomTimePeriod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomTimePeriodRepository extends JpaRepository<CustomTimePeriod, Long> {
}
