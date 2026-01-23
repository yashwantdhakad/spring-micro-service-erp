package com.monash.erp.party.dto;

public class SupplierProfile {

    private String partyId;
    private String groupName;
    private String partyTypeId;
    private String statusId;

    public SupplierProfile(String partyId, String groupName, String partyTypeId, String statusId) {
        this.partyId = partyId;
        this.groupName = groupName;
        this.partyTypeId = partyTypeId;
        this.statusId = statusId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getPartyTypeId() {
        return partyTypeId;
    }

    public void setPartyTypeId(String partyTypeId) {
        this.partyTypeId = partyTypeId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
}
