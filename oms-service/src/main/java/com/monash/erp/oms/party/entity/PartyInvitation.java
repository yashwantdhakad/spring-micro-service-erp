package com.monash.erp.oms.party.entity;

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
public class PartyInvitation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyInvitationId;
    private String partyIdFrom;
    private String partyId;
    private String toName;
    private String emailAddress;
    private String statusId;
    private LocalDateTime lastInviteDate;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyInvitationId(String partyInvitationId) {
        this.partyInvitationId = partyInvitationId;
    }
public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setToName(String toName) {
        this.toName = toName;
    }
public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setLastInviteDate(LocalDateTime lastInviteDate) {
        this.lastInviteDate = lastInviteDate;
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
