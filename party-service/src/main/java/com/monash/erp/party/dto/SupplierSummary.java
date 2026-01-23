package com.monash.erp.party.dto;

public class SupplierSummary {

    private String partyId;
    private String groupName;
    private String contactNumber;
    private String emailAddress;

    public SupplierSummary() {
    }

    public SupplierSummary(String partyId, String groupName, String contactNumber, String emailAddress) {
        this.partyId = partyId;
        this.groupName = groupName;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
