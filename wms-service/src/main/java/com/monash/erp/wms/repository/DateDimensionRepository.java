package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.DateDimension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DateDimensionRepository extends JpaRepository<DateDimension, Long> {
}