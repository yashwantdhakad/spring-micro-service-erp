package com.monash.erp.oms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class QuoteNote extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String quoteId;
    private String noteId;
    private String internalNote;
public void setId(Long id) {
        this.id = id;
    }
public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }
public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
public void setInternalNote(String internalNote) {
        this.internalNote = internalNote;
    }

}
