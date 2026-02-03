package com.monash.erp.mfg.entity;

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
public class WorkEffortNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workEffortId;
    private String noteId;
    private String internalNote;
public void setId(Long id) {
        this.id = id;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
public void setInternalNote(String internalNote) {
        this.internalNote = internalNote;
    }

}
