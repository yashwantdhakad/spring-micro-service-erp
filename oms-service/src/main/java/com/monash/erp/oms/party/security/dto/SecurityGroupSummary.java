package com.monash.erp.oms.party.security.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SecurityGroupSummary {

    private String groupId;
    private String groupName;
}
