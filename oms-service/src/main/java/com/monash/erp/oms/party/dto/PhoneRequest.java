package com.monash.erp.oms.party.dto;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PhoneRequest {

    private String contactMechPurposeId;
    private String contactNumber;
    private String countryCode;
    private String areaCode;
}
