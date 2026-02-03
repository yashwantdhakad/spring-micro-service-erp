package com.monash.erp.party.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerSummary {

    private String partyId;
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String emailAddress;
}
