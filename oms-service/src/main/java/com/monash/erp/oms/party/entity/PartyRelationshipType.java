package com.monash.erp.oms.party.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setPartyRelationshipTypeId(String partyRelationshipTypeId) {
        this.partyRelationshipTypeId = partyRelationshipTypeId;
    }
public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
    }
public void setPartyRelationshipName(String partyRelationshipName) {
        this.partyRelationshipName = partyRelationshipName;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setRoleTypeIdValidFrom(String roleTypeIdValidFrom) {
        this.roleTypeIdValidFrom = roleTypeIdValidFrom;
    }
public void setRoleTypeIdValidTo(String roleTypeIdValidTo) {
        this.roleTypeIdValidTo = roleTypeIdValidTo;
    }

}
