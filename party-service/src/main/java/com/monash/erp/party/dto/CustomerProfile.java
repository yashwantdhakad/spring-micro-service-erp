package com.monash.erp.party.dto;

public class CustomerProfile {

    private String partyId;
    private String firstName;
    private String lastName;
    private String partyTypeId;
    private String statusId;

    public CustomerProfile(String partyId, String firstName, String lastName, String partyTypeId, String statusId) {
        this.partyId = partyId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.partyTypeId = partyTypeId;
        this.statusId = statusId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
