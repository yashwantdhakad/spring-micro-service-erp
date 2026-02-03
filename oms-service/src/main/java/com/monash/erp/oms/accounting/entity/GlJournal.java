package com.monash.erp.oms.accounting.entity;

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
public class GlJournal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glJournalId;

    private String glJournalName;

    private String organizationPartyId;

    private Boolean isPosted;

    private LocalDateTime postedDate;
public void setId(Long id) {
        this.id = id;
    }
public void setGlJournalId(String glJournalId) {
        this.glJournalId = glJournalId;
    }
public void setGlJournalName(String glJournalName) {
        this.glJournalName = glJournalName;
    }
public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
public void setIsPosted(Boolean isPosted) {
        this.isPosted = isPosted;
    }
public void setPostedDate(LocalDateTime postedDate) {
        this.postedDate = postedDate;
    }
}
