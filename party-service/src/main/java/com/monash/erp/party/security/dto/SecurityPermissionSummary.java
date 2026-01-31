package com.monash.erp.party.security.dto;

public class SecurityPermissionSummary {

    private String permissionId;
    private String description;

    public SecurityPermissionSummary() {}

    public SecurityPermissionSummary(String permissionId, String description) {
        this.permissionId = permissionId;
        this.description = description;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
