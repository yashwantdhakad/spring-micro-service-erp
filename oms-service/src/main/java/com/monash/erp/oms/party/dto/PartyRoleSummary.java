package com.monash.erp.oms.party.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PartyRoleSummary {

    private String partyId;
    private String roleTypeId;
    private String name;
}
