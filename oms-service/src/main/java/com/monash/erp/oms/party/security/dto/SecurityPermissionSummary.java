package com.monash.erp.oms.party.security.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SecurityPermissionSummary {

    private String permissionId;
    private String description;
}
