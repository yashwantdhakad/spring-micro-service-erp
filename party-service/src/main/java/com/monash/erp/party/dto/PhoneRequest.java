package com.monash.erp.party.dto;

public class PhoneRequest {

    private String contactMechPurposeId;
    private String contactNumber;
    private String countryCode;
    private String areaCode;

    public String getContactMechPurposeId() {
        return contactMechPurposeId;
    }

    public void setContactMechPurposeId(String contactMechPurposeId) {
        this.contactMechPurposeId = contactMechPurposeId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}
