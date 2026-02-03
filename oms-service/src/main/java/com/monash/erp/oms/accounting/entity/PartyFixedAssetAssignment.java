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
public class PartyFixedAssetAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyId;

    private String roleTypeId;

    private String fixedAssetId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private LocalDateTime allocatedDate;

    private String statusId;

    private String comments;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setAllocatedDate(LocalDateTime allocatedDate) {
        this.allocatedDate = allocatedDate;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
}
