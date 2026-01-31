package com.monash.erp.wms.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PicklistOrderGroupDto {

    private String orderId;
    private String picklistId;
    private String facilityId;
    private String statusId;
    private LocalDateTime createdDate;
    private BigDecimal pickQuantity;
    private int itemCount;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPicklistId() {
        return picklistId;
    }

    public void setPicklistId(String picklistId) {
        this.picklistId = picklistId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
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

    public BigDecimal getPickQuantity() {
        return pickQuantity;
    }

    public void setPickQuantity(BigDecimal pickQuantity) {
        this.pickQuantity = pickQuantity;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
