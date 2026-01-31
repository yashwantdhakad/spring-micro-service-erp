package com.monash.erp.party.security.dto;

import java.util.List;

public class UserDetail {

    private UserProfile user;
    private List<SecurityGroupSummary> roles;
    private List<SecurityPermissionSummary> permissions;

    public UserDetail() {}

    public UserDetail(UserProfile user,
                      List<SecurityGroupSummary> roles,
                      List<SecurityPermissionSummary> permissions) {
        this.user = user;
        this.roles = roles;
        this.permissions = permissions;
    }

    public UserProfile getUser() {
        return user;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public List<SecurityGroupSummary> getRoles() {
        return roles;
    }

    public void setRoles(List<SecurityGroupSummary> roles) {
        this.roles = roles;
    }

    public List<SecurityPermissionSummary> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SecurityPermissionSummary> permissions) {
        this.permissions = permissions;
    }
}
