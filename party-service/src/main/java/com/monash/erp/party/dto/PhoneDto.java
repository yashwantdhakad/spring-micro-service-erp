package com.monash.erp.party.dto;

public class PhoneDto {

    private String contactMechId;
    private String contactMechPurposeId;
    private String countryCode;
    private String areaCode;
    private String contactNumber;

    public PhoneDto(String contactMechId,
                    String contactMechPurposeId,
                    String countryCode,
                    String areaCode,
                    String contactNumber) {
        this.contactMechId = contactMechId;
        this.contactMechPurposeId = contactMechPurposeId;
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.contactNumber = contactNumber;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
