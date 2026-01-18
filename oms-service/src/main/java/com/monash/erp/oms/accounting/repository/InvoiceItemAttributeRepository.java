package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.InvoiceItemAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemAttributeRepository extends JpaRepository<InvoiceItemAttribute, Long> {
}
