package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.InvoiceTerm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceTermRepository extends JpaRepository<InvoiceTerm, Long> {
}