package com.monash.erp.wms.dto;

import java.util.List;

public class InventoryReservationResponse {

    private String orderId;
    private String facilityId;
    private String shipGroupSeqId;
    private List<InventoryReservationItemResponse> items;

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

    public List<InventoryReservationItemResponse> getItems() {
        return items;
    }

    public void setItems(List<InventoryReservationItemResponse> items) {
        this.items = items;
    }
}
