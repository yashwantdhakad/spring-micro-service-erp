package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.InvoiceTermAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceTermAttributeRepository extends JpaRepository<InvoiceTermAttribute, Long> {
}
