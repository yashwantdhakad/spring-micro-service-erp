package com.monash.erp.oms.order.dto;

public class OrganizationDto {

    private String organizationName;

    public OrganizationDto() {
    }

    public OrganizationDto(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
