package com.monash.erp.wms.dto;

import java.util.List;

public class SalesOrderPicklistRequest {

    private String orderId;
    private String facilityId;
    private String shipGroupSeqId;
    private String shipmentMethodTypeId;
    private List<SalesOrderPicklistItemRequest> items;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public String getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }

    public List<SalesOrderPicklistItemRequest> getItems() {
        return items;
    }

    public void setItems(List<SalesOrderPicklistItemRequest> items) {
        this.items = items;
    }
}
