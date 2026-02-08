package com.monash.erp.oms.party.dto;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmailRequest {

    private String contactMechPurposeId;
    private String emailAddress;
}
