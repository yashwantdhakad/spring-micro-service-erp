package com.monash.erp.wms.dto;

public class ShipmentListResponse {

    private ShipmentListResponseMap responseMap;

    public ShipmentListResponse() {
    }

    public ShipmentListResponse(ShipmentListResponseMap responseMap) {
        this.responseMap = responseMap;
    }

    public ShipmentListResponseMap getResponseMap() {
        return responseMap;
    }

    public void setResponseMap(ShipmentListResponseMap responseMap) {
        this.responseMap = responseMap;
    }
}
