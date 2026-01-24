package com.monash.erp.oms.order.dto;

public class OrderContactMechDto {

    private String contactMechPurposeTypeId;
    private String contactMechId;
    private PostalAddressDto postalAddress;
    private GeoDto postalAddressStateGeo;

    public String getContactMechPurposeTypeId() {
        return contactMechPurposeTypeId;
    }

    public void setContactMechPurposeTypeId(String contactMechPurposeTypeId) {
        this.contactMechPurposeTypeId = contactMechPurposeTypeId;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public PostalAddressDto getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(PostalAddressDto postalAddress) {
        this.postalAddress = postalAddress;
    }

    public GeoDto getPostalAddressStateGeo() {
        return postalAddressStateGeo;
    }

    public void setPostalAddressStateGeo(GeoDto postalAddressStateGeo) {
        this.postalAddressStateGeo = postalAddressStateGeo;
    }
}
