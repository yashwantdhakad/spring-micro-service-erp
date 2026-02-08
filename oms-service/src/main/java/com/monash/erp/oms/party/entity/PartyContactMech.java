package com.monash.erp.oms.party.entity;

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
        name = "party_contact_mech",
        indexes = {
                @Index(name = "idx_party_contact_mech_party_id", columnList = "party_id"),
                @Index(name = "idx_party_contact_mech_contact_mech_id", columnList = "contact_mech_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class PartyContactMech {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyId;
    private String contactMechId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String roleTypeId;
    private String allowSolicitation;
    private String extension;
    private String verified;
    private String comments;
    private String yearsWithContactMech;
    private String monthsWithContactMech;
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
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setAllowSolicitation(String allowSolicitation) {
        this.allowSolicitation = allowSolicitation;
    }
public void setExtension(String extension) {
        this.extension = extension;
    }
public void setVerified(String verified) {
        this.verified = verified;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setYearsWithContactMech(String yearsWithContactMech) {
        this.yearsWithContactMech = yearsWithContactMech;
    }
public void setMonthsWithContactMech(String monthsWithContactMech) {
        this.monthsWithContactMech = monthsWithContactMech;
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
