package com.monash.erp.party.dto;

public class RoleSummary {

    private String roleType;
    private String roleTypeId;

    public RoleSummary(String roleType, String roleTypeId) {
        this.roleType = roleType;
        this.roleTypeId = roleTypeId;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
}
