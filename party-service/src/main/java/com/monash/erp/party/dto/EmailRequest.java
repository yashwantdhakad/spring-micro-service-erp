package com.monash.erp.party.dto;

public class EmailRequest {

    private String contactMechPurposeId;
    private String emailAddress;

    public String getContactMechPurposeId() {
        return contactMechPurposeId;
    }

    public void setContactMechPurposeId(String contactMechPurposeId) {
        this.contactMechPurposeId = contactMechPurposeId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
