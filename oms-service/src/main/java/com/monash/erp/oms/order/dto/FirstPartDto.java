package com.monash.erp.oms.order.dto;

public class FirstPartDto {

    private String customerPartyId;
    private String vendorPartyId;
    private String facilityId;
    private String orderPartSeqId;

    public String getCustomerPartyId() {
        return customerPartyId;
    }

    public void setCustomerPartyId(String customerPartyId) {
        this.customerPartyId = customerPartyId;
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

    public String getOrderPartSeqId() {
        return orderPartSeqId;
    }

    public void setOrderPartSeqId(String orderPartSeqId) {
        this.orderPartSeqId = orderPartSeqId;
    }
}
