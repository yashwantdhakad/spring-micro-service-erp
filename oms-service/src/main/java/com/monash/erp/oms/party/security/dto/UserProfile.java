package com.monash.erp.oms.party.security.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserProfile {

    private String userLoginId;
    private String partyId;
    private String firstName;
    private String lastName;
    private Boolean enabled;
    private Boolean requirePasswordChange;
    private Boolean isSystem;
    private LocalDateTime disabledDateTime;
}
