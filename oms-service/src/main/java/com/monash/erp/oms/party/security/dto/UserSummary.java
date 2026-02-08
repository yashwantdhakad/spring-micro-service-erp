package com.monash.erp.oms.party.security.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserSummary {

    private String userLoginId;
    private String partyId;
    private Boolean enabled;
    private List<SecurityGroupSummary> roles;
}
