package com.monash.erp.oms.party.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PhoneDto {

    private String contactMechId;
    private String contactMechPurposeId;
    private String countryCode;
    private String areaCode;
    private String contactNumber;
}
