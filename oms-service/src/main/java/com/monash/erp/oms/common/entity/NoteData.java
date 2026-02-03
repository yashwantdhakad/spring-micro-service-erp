package com.monash.erp.oms.common.entity;

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
public class NoteData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String noteId;

    private String noteName;

    private String noteInfo;

    private LocalDateTime noteDateTime;
public void setId(Long id) {
        this.id = id;
    }
public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
public void setNoteName(String noteName) {
        this.noteName = noteName;
    }
public void setNoteInfo(String noteInfo) {
        this.noteInfo = noteInfo;
    }
public void setNoteDateTime(LocalDateTime noteDateTime) {
        this.noteDateTime = noteDateTime;
    }
}
