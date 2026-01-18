package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.InvoiceContentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceContentTypeRepository extends JpaRepository<InvoiceContentType, Long> {
}
