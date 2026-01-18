package com.monash.erp.party.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PartyRelationshipType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyRelationshipTypeId;
    private String parentTypeId;
    private String hasTable;
    private String partyRelationshipName;
    private String description;
    private String roleTypeIdValidFrom;
    private String roleTypeIdValidTo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartyRelationshipTypeId() {
        return partyRelationshipTypeId;
    }

    public void setPartyRelationshipTypeId(String partyRelationshipTypeId) {
        this.partyRelationshipTypeId = partyRelationshipTypeId;
    }

    public String getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public String getHasTable() {
        return hasTable;
    }

    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
    }

    public String getPartyRelationshipName() {
        return partyRelationshipName;
    }

    public void setPartyRelationshipName(String partyRelationshipName) {
        this.partyRelationshipName = partyRelationshipName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoleTypeIdValidFrom() {
        return roleTypeIdValidFrom;
    }

    public void setRoleTypeIdValidFrom(String roleTypeIdValidFrom) {
        this.roleTypeIdValidFrom = roleTypeIdValidFrom;
    }

    public String getRoleTypeIdValidTo() {
        return roleTypeIdValidTo;
    }

    public void setRoleTypeIdValidTo(String roleTypeIdValidTo) {
        this.roleTypeIdValidTo = roleTypeIdValidTo;
    }

}