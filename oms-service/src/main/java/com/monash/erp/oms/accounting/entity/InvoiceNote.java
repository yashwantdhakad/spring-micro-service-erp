package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class InvoiceNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String invoiceId;

    private String noteId;
public void setId(Long id) {
        this.id = id;
    }
public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
}
