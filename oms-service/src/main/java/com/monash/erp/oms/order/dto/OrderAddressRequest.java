package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderAddressRequest {

    private String contactMechId;
    private String contactMechPurposeTypeId;
    private String toName;
    private String address1;
    private String address2;
    private String city;
    private String postalCode;
    private String countryGeoId;
    private String stateProvinceGeoId;
}
