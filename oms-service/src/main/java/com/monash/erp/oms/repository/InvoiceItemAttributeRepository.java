package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.InvoiceItemAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemAttributeRepository extends JpaRepository<InvoiceItemAttribute, Long> {
}