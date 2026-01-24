package com.monash.erp.oms.order.dto;

public class GeoDto {

    private String geoName;

    public GeoDto() {
    }

    public GeoDto(String geoName) {
        this.geoName = geoName;
    }

    public String getGeoName() {
        return geoName;
    }

    public void setGeoName(String geoName) {
        this.geoName = geoName;
    }
}
