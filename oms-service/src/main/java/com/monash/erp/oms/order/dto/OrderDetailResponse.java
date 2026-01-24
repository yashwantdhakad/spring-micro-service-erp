package com.monash.erp.oms.order.dto;

import java.util.List;

public class OrderDetailResponse {

    private List<OrderPartDto> parts;
    private List<OrderContentDto> contents;
    private List<OrderAdjustmentDto> adjustments;

    public List<OrderPartDto> getParts() {
        return parts;
    }

    public void setParts(List<OrderPartDto> parts) {
        this.parts = parts;
    }

    public List<OrderContentDto> getContents() {
        return contents;
    }

    public void setContents(List<OrderContentDto> contents) {
        this.contents = contents;
    }

    public List<OrderAdjustmentDto> getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(List<OrderAdjustmentDto> adjustments) {
        this.adjustments = adjustments;
    }
}
