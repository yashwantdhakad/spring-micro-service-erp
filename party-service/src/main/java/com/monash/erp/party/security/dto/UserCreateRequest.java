package com.monash.erp.party.security.dto;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserCreateRequest {

    private String userLoginId;
    private String password;
    private String partyId;
    private String firstName;
    private String lastName;
    private Boolean enabled;
    private Boolean requirePasswordChange;
    private List<String> roleIds;
    private List<String> permissionIds;
}
