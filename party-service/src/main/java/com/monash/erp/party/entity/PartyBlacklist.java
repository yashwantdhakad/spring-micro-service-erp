package com.monash.erp.party.entity;

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
public class PartyBlacklist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyBlacklistId;
    private String partyId;
    private String noteId;
    private String endReasonNoteId;
    private String isBlacklist;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String createdByUserLoginId;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyBlacklistId(String partyBlacklistId) {
        this.partyBlacklistId = partyBlacklistId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
public void setEndReasonNoteId(String endReasonNoteId) {
        this.endReasonNoteId = endReasonNoteId;
    }
public void setIsBlacklist(String isBlacklist) {
        this.isBlacklist = isBlacklist;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setCreatedByUserLoginId(String createdByUserLoginId) {
        this.createdByUserLoginId = createdByUserLoginId;
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

}
