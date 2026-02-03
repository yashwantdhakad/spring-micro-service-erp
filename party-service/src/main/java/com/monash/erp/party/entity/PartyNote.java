package com.monash.erp.party.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "party_note",
        indexes = {
                @Index(name = "idx_party_note_party_id", columnList = "party_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class PartyNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyId;
    private String noteId;
    private String noteText;
    private LocalDateTime noteDate;
    private String createdBy;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
public void setNoteText(String noteText) {
        this.noteText = noteText;
    }
public void setNoteDate(LocalDateTime noteDate) {
        this.noteDate = noteDate;
    }
public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

}
