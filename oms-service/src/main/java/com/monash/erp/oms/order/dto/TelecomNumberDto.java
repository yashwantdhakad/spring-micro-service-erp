package com.monash.erp.oms.order.dto;

public class TelecomNumberDto {

    private String countryCode;
    private String areaCode;
    private String contactNumber;

    public TelecomNumberDto() {
    }

    public TelecomNumberDto(String countryCode, String areaCode, String contactNumber) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
