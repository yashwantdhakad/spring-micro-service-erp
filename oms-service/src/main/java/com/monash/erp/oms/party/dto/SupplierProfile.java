package com.monash.erp.oms.party.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SupplierProfile {

    private String partyId;
    private String groupName;
    private String partyTypeId;
    private String statusId;
}
