package com.monash.erp.oms.accounting.entity;

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
public class PartyGlAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String organizationPartyId;

    private String partyId;

    private String roleTypeId;

    private String glAccountTypeId;

    private String glAccountId;
public void setId(Long id) {
        this.id = id;
    }
public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setGlAccountTypeId(String glAccountTypeId) {
        this.glAccountTypeId = glAccountTypeId;
    }
public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
}
