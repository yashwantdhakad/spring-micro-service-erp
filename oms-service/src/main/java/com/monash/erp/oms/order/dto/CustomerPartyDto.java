package com.monash.erp.oms.order.dto;

public class CustomerPartyDto {

    private PersonDto person;
    private OrganizationDto organization;

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }

    public OrganizationDto getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationDto organization) {
        this.organization = organization;
    }
}
