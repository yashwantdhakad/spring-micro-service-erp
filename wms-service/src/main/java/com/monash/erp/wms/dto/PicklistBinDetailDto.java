package com.monash.erp.wms.dto;

import java.util.List;

public class PicklistBinDetailDto {

    private String picklistBinId;
    private String binLocationNumber;
    private String primaryOrderId;
    private String primaryShipGroupSeqId;
    private List<PicklistItemDetailDto> items;

    public String getPicklistBinId() {
        return picklistBinId;
    }

    public void setPicklistBinId(String picklistBinId) {
        this.picklistBinId = picklistBinId;
    }

    public String getBinLocationNumber() {
        return binLocationNumber;
    }

    public void setBinLocationNumber(String binLocationNumber) {
        this.binLocationNumber = binLocationNumber;
    }

    public String getPrimaryOrderId() {
        return primaryOrderId;
    }

    public void setPrimaryOrderId(String primaryOrderId) {
        this.primaryOrderId = primaryOrderId;
    }

    public String getPrimaryShipGroupSeqId() {
        return primaryShipGroupSeqId;
    }

    public void setPrimaryShipGroupSeqId(String primaryShipGroupSeqId) {
        this.primaryShipGroupSeqId = primaryShipGroupSeqId;
    }

    public List<PicklistItemDetailDto> getItems() {
        return items;
    }

    public void setItems(List<PicklistItemDetailDto> items) {
        this.items = items;
    }
}
