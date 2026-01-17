package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.InvoiceNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceNoteRepository extends JpaRepository<InvoiceNote, Long> {
}
