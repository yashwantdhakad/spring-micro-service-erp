package com.monash.erp.party.security.dto;

import java.util.List;

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

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<String> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<String> roleIds) {
        this.roleIds = roleIds;
    }

    public List<String> getPermissionIds() {
        return permissionIds;
    }

    public void setPermissionIds(List<String> permissionIds) {
        this.permissionIds = permissionIds;
    }
}
