package com.monash.erp.wms.dto;

public class SalesOrderPicklistResponse {

    private String picklistId;
    private String picklistBinId;
    private String shipmentId;

    public SalesOrderPicklistResponse() {
    }

    public SalesOrderPicklistResponse(String picklistId, String picklistBinId, String shipmentId) {
        this.picklistId = picklistId;
        this.picklistBinId = picklistBinId;
        this.shipmentId = shipmentId;
    }

    public String getPicklistId() {
        return picklistId;
    }

    public void setPicklistId(String picklistId) {
        this.picklistId = picklistId;
    }

    public String getPicklistBinId() {
        return picklistBinId;
    }

    public void setPicklistBinId(String picklistBinId) {
        this.picklistBinId = picklistBinId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
}
