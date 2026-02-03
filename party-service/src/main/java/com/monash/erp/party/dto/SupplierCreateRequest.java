package com.monash.erp.party.dto;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SupplierCreateRequest {

    private String groupName;
    private String emailAddress;
    private String contactNumber;
    private String countryCode;
    private String areaCode;
    private String roleTypeId;
    private String toName;
    private String address1;
    private String address2;
    private String city;
    private String postalCode;
    private String countryGeoId;
    private String stateProvinceGeoId;
    private String emailPurposeId;
    private String phonePurposeId;
    private String addressPurposeId;
}
