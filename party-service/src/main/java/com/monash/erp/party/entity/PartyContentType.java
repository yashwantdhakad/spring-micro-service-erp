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
public class PartyContentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyContentTypeId;
    private String parentTypeId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyContentTypeId(String partyContentTypeId) {
        this.partyContentTypeId = partyContentTypeId;
    }
public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
