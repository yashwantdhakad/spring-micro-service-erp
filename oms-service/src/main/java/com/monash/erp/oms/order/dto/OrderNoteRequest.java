package com.monash.erp.oms.order.dto;

import java.time.LocalDateTime;

public class OrderNoteRequest {

    private String noteText;
    private LocalDateTime noteDate;
    private String userId;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
