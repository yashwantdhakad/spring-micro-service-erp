package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.InvoiceContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceContentRepository extends JpaRepository<InvoiceContent, Long> {
}
