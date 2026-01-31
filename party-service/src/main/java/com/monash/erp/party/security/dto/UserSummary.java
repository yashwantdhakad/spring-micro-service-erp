package com.monash.erp.party.security.dto;

import java.util.List;

public class UserSummary {

    private String userLoginId;
    private String partyId;
    private Boolean enabled;
    private List<SecurityGroupSummary> roles;

    public UserSummary() {}

    public UserSummary(String userLoginId, String partyId, Boolean enabled, List<SecurityGroupSummary> roles) {
        this.userLoginId = userLoginId;
        this.partyId = partyId;
        this.enabled = enabled;
        this.roles = roles;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<SecurityGroupSummary> getRoles() {
        return roles;
    }

    public void setRoles(List<SecurityGroupSummary> roles) {
        this.roles = roles;
    }
}
