package com.monash.erp.party.dto;

import java.time.LocalDateTime;

public class NoteDto {

    private String noteId;
    private String noteText;
    private LocalDateTime noteDate;
    private String createdBy;

    public NoteDto(String noteId, String noteText, LocalDateTime noteDate, String createdBy) {
        this.noteId = noteId;
        this.noteText = noteText;
        this.noteDate = noteDate;
        this.createdBy = createdBy;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public LocalDateTime getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(LocalDateTime noteDate) {
        this.noteDate = noteDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
