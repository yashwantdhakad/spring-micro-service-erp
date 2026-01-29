package com.monash.erp.party.dto;

public class PartyRoleSummary {

    private String partyId;
    private String roleTypeId;
    private String name;

    public PartyRoleSummary() {
    }

    public PartyRoleSummary(String partyId, String roleTypeId, String name) {
        this.partyId = partyId;
        this.roleTypeId = roleTypeId;
        this.name = name;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
