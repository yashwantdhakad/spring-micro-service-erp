package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.InvoiceItemTypeMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemTypeMapRepository extends JpaRepository<InvoiceItemTypeMap, Long> {
}
