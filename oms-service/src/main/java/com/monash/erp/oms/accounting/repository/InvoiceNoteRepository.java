package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.InvoiceNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceNoteRepository extends JpaRepository<InvoiceNote, Long> {
}
