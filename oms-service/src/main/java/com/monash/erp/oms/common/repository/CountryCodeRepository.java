package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.CountryCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryCodeRepository extends JpaRepository<CountryCode, Long> {
}
