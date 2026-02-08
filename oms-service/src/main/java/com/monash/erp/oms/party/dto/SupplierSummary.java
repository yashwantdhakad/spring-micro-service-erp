package com.monash.erp.oms.party.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SupplierSummary {

    private String partyId;
    private String groupName;
    private String contactNumber;
    private String emailAddress;
}
