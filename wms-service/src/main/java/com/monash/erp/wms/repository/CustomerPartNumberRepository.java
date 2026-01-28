package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.CustomerPartNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerPartNumberRepository extends JpaRepository<CustomerPartNumber, Long> {
}