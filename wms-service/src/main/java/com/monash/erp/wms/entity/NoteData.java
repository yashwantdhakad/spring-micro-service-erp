package com.monash.erp.wms.entity;

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
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String moreInfoPortletId;
    private String moreInfoItemId;
    private String noteParty;
    private String createdByUserLogin;
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
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }
public void setMoreInfoPortletId(String moreInfoPortletId) {
        this.moreInfoPortletId = moreInfoPortletId;
    }
public void setMoreInfoItemId(String moreInfoItemId) {
        this.moreInfoItemId = moreInfoItemId;
    }
public void setNoteParty(String noteParty) {
        this.noteParty = noteParty;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

}
