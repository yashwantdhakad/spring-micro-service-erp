package com.monash.erp.party.dto;

public class AddressDto {

    private String contactMechId;
    private String contactMechPurposeId;
    private String toName;
    private String address1;
    private String address2;
    private String city;
    private String postalCode;
    private String countryGeoId;
    private String stateProvinceGeoId;

    public AddressDto(String contactMechId,
                      String contactMechPurposeId,
                      String toName,
                      String address1,
                      String address2,
                      String city,
                      String postalCode,
                      String countryGeoId,
                      String stateProvinceGeoId) {
        this.contactMechId = contactMechId;
        this.contactMechPurposeId = contactMechPurposeId;
        this.toName = toName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.postalCode = postalCode;
        this.countryGeoId = countryGeoId;
        this.stateProvinceGeoId = stateProvinceGeoId;
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

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryGeoId() {
        return countryGeoId;
    }

    public void setCountryGeoId(String countryGeoId) {
        this.countryGeoId = countryGeoId;
    }

    public String getStateProvinceGeoId() {
        return stateProvinceGeoId;
    }

    public void setStateProvinceGeoId(String stateProvinceGeoId) {
        this.stateProvinceGeoId = stateProvinceGeoId;
    }
}
