package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostalAddressDto {

    private String toName;
    private String address1;
    private String address2;
    private String city;
    private String postalCode;
    private String countryGeoId;
    private String stateProvinceGeoId;
    private GeoDto stateProvinceGeo;
}
