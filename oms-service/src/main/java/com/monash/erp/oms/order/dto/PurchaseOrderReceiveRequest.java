package com.monash.erp.oms.order.dto;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseOrderReceiveRequest {

    private String facilityId;
    private String vendorPartyId;
    private String shipGroupSeqId;
    private LocalDateTime receivedDate;
    private List<PurchaseOrderReceiveItemRequest> items;

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getVendorPartyId() {
        return vendorPartyId;
    }

    public void setVendorPartyId(String vendorPartyId) {
        this.vendorPartyId = vendorPartyId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public LocalDateTime getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDateTime receivedDate) {
        this.receivedDate = receivedDate;
    }

    public List<PurchaseOrderReceiveItemRequest> getItems() {
        return items;
    }

    public void setItems(List<PurchaseOrderReceiveItemRequest> items) {
        this.items = items;
    }
}
