package com.monash.erp.oms.order.dto;

public class FacilityContactInfoDto {

    private PostalAddressDto postalAddress;
    private GeoDto postalAddressStateGeo;

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
