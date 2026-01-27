package com.monash.erp.wms.dto;

import java.time.LocalDateTime;
import java.util.List;

public class PicklistOrderSummaryDto {

    private String picklistId;
    private String picklistBinId;
    private String statusId;
    private LocalDateTime createdDate;
    private String shipmentId;
    private List<PicklistOrderItemDto> items;

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

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public List<PicklistOrderItemDto> getItems() {
        return items;
    }

    public void setItems(List<PicklistOrderItemDto> items) {
        this.items = items;
    }
}
