package com.monash.erp.party.dto;

public class EmailDto {

    private String contactMechId;
    private String contactMechPurposeId;
    private String emailAddress;

    public EmailDto(String contactMechId, String contactMechPurposeId, String emailAddress) {
        this.contactMechId = contactMechId;
        this.contactMechPurposeId = contactMechPurposeId;
        this.emailAddress = emailAddress;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

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
