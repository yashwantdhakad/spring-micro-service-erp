package com.monash.erp.party.security.dto;

import java.time.LocalDateTime;

public class UserProfile {

    private String userLoginId;
    private String partyId;
    private String firstName;
    private String lastName;
    private Boolean enabled;
    private Boolean requirePasswordChange;
    private Boolean isSystem;
    private LocalDateTime disabledDateTime;

    public UserProfile() {}

    public UserProfile(String userLoginId,
                       String partyId,
                       String firstName,
                       String lastName,
                       Boolean enabled,
                       Boolean requirePasswordChange,
                       Boolean isSystem,
                       LocalDateTime disabledDateTime) {
        this.userLoginId = userLoginId;
        this.partyId = partyId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enabled = enabled;
        this.requirePasswordChange = requirePasswordChange;
        this.isSystem = isSystem;
        this.disabledDateTime = disabledDateTime;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getRequirePasswordChange() {
        return requirePasswordChange;
    }

    public void setRequirePasswordChange(Boolean requirePasswordChange) {
        this.requirePasswordChange = requirePasswordChange;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public LocalDateTime getDisabledDateTime() {
        return disabledDateTime;
    }

    public void setDisabledDateTime(LocalDateTime disabledDateTime) {
        this.disabledDateTime = disabledDateTime;
    }
}
