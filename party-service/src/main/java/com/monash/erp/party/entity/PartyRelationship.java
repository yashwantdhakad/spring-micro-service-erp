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
public class PartyRelationship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyIdFrom;
    private String partyIdTo;
    private String roleTypeIdFrom;
    private String roleTypeIdTo;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String statusId;
    private String relationshipName;
    private String securityGroupId;
    private String priorityTypeId;
    private String partyRelationshipTypeId;
    private String permissionsEnumId;
    private String positionTitle;
    private String comments;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
public void setRoleTypeIdFrom(String roleTypeIdFrom) {
        this.roleTypeIdFrom = roleTypeIdFrom;
    }
public void setRoleTypeIdTo(String roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }
public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }
public void setPriorityTypeId(String priorityTypeId) {
        this.priorityTypeId = priorityTypeId;
    }
public void setPartyRelationshipTypeId(String partyRelationshipTypeId) {
        this.partyRelationshipTypeId = partyRelationshipTypeId;
    }
public void setPermissionsEnumId(String permissionsEnumId) {
        this.permissionsEnumId = permissionsEnumId;
    }
public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }
public void setComments(String comments) {
        this.comments = comments;
    }

}
