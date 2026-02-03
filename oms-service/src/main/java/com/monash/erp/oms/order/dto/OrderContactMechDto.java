package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderContactMechDto {

    private String contactMechPurposeTypeId;
    private String contactMechId;
    private PostalAddressDto postalAddress;
    private GeoDto postalAddressStateGeo;
}
