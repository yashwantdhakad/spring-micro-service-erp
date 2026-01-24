package com.monash.erp.wms.dto;

import com.monash.erp.wms.entity.Facility;
import com.monash.erp.wms.entity.FacilityLocation;

import java.util.List;

public class FacilityDetailResponse {

    private Facility facility;
    private List<FacilityLocation> locations;

    public FacilityDetailResponse() {
    }

    public FacilityDetailResponse(Facility facility, List<FacilityLocation> locations) {
        this.facility = facility;
        this.locations = locations;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public List<FacilityLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<FacilityLocation> locations) {
        this.locations = locations;
    }
}
