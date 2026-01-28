package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.CountryCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryCodeRepository extends JpaRepository<CountryCode, Long> {
}