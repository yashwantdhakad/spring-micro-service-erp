package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.InvoiceItemTypeMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemTypeMapRepository extends JpaRepository<InvoiceItemTypeMap, Long> {
}
