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
public class PartyNameHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyId;
    private LocalDateTime changeDate;
    private String groupName;
    private String firstName;
    private String middleName;
    private String lastName;
    private String personalTitle;
    private String suffix;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setChangeDate(LocalDateTime changeDate) {
        this.changeDate = changeDate;
    }
public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
public void setLastName(String lastName) {
        this.lastName = lastName;
    }
public void setPersonalTitle(String personalTitle) {
        this.personalTitle = personalTitle;
    }
public void setSuffix(String suffix) {
        this.suffix = suffix;
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
