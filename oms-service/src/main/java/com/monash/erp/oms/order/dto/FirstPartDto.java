package com.monash.erp.oms.order.dto;

public class FirstPartDto {

    private String customerPartyId;
    private String vendorPartyId;

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
}
