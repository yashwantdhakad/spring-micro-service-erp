package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.InvoiceAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceAttributeRepository extends JpaRepository<InvoiceAttribute, Long> {
}
