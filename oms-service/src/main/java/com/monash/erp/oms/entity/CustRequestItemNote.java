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
public class CustRequestItemNote extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String custRequestId;
    private String custRequestItemSeqId;
    private String noteId;
public void setId(Long id) {
        this.id = id;
    }
public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }
public void setCustRequestItemSeqId(String custRequestItemSeqId) {
        this.custRequestItemSeqId = custRequestItemSeqId;
    }
public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

}
