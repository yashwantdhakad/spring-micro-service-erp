package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.ZipSalesTaxLookup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipSalesTaxLookupRepository extends JpaRepository<ZipSalesTaxLookup, Long> {
}
