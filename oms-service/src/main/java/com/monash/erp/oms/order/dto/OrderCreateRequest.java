package com.monash.erp.oms.order.dto;

import java.time.LocalDateTime;

public class OrderCreateRequest {

    private String orderTypeEnumId;
    private String productStoreId;
    private String vendorPartyId;
    private String facilityId;
    private String customerPartyId;
    private LocalDateTime shipBeforeDate;
    private LocalDateTime estimatedDeliveryDate;

    public String getOrderTypeEnumId() {
        return orderTypeEnumId;
    }

    public void setOrderTypeEnumId(String orderTypeEnumId) {
        this.orderTypeEnumId = orderTypeEnumId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getVendorPartyId() {
        return vendorPartyId;
    }

    public void setVendorPartyId(String vendorPartyId) {
        this.vendorPartyId = vendorPartyId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getCustomerPartyId() {
        return customerPartyId;
    }

    public void setCustomerPartyId(String customerPartyId) {
        this.customerPartyId = customerPartyId;
    }

    public LocalDateTime getShipBeforeDate() {
        return shipBeforeDate;
    }

    public void setShipBeforeDate(LocalDateTime shipBeforeDate) {
        this.shipBeforeDate = shipBeforeDate;
    }

    public LocalDateTime getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }
}
