package com.monash.erp.party.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmailDto {

    private String contactMechId;
    private String contactMechPurposeId;
    private String emailAddress;
}
