package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.ZipSalesTaxLookup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipSalesTaxLookupRepository extends JpaRepository<ZipSalesTaxLookup, Long> {
}
