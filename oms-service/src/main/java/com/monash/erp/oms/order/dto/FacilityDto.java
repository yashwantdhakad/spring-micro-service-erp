package com.monash.erp.oms.order.dto;

public class FacilityDto {

    private String facilityId;
    private String facilityName;

    public FacilityDto() {
    }

    public FacilityDto(String facilityId, String facilityName) {
        this.facilityId = facilityId;
        this.facilityName = facilityName;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }
}
