package com.monash.erp.wms.dto;

import com.monash.erp.wms.entity.Picklist;
import java.util.List;

public class PicklistDetailDto {

    private Picklist picklist;
    private String pickerId;
    private List<PicklistBinDetailDto> bins;

    public Picklist getPicklist() {
        return picklist;
    }

    public void setPicklist(Picklist picklist) {
        this.picklist = picklist;
    }

    public String getPickerId() {
        return pickerId;
    }

    public void setPickerId(String pickerId) {
        this.pickerId = pickerId;
    }

    public List<PicklistBinDetailDto> getBins() {
        return bins;
    }

    public void setBins(List<PicklistBinDetailDto> bins) {
        this.bins = bins;
    }
}
