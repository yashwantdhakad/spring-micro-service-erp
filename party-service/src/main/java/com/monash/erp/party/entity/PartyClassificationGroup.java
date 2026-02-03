package com.monash.erp.party.entity;

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
public class PartyClassificationGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyClassificationGroupId;
    private String partyClassificationTypeId;
    private String parentGroupId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyClassificationGroupId(String partyClassificationGroupId) {
        this.partyClassificationGroupId = partyClassificationGroupId;
    }
public void setPartyClassificationTypeId(String partyClassificationTypeId) {
        this.partyClassificationTypeId = partyClassificationTypeId;
    }
public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
