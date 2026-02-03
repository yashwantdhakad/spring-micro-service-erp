package com.monash.erp.party.security.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDetail {

    private UserProfile user;
    private List<SecurityGroupSummary> roles;
    private List<SecurityPermissionSummary> permissions;
}
