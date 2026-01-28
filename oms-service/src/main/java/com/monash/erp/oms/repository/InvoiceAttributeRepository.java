package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.InvoiceAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceAttributeRepository extends JpaRepository<InvoiceAttribute, Long> {
}