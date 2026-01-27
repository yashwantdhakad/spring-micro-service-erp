package com.monash.erp.wms.dto;

import java.util.List;

public class InventoryReservationRequest {

    private String orderId;
    private String shipGroupSeqId;
    private String facilityId;
    private List<InventoryReservationItemRequest> items;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public List<InventoryReservationItemRequest> getItems() {
        return items;
    }

    public void setItems(List<InventoryReservationItemRequest> items) {
        this.items = items;
    }
}
