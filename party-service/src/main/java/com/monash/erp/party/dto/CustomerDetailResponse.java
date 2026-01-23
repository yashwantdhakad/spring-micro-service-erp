package com.monash.erp.party.dto;

public class CustomerDetailResponse {

    private CustomerDetail customerDetail;

    public CustomerDetailResponse(CustomerDetail customerDetail) {
        this.customerDetail = customerDetail;
    }

    public CustomerDetail getCustomerDetail() {
        return customerDetail;
    }

    public void setCustomerDetail(CustomerDetail customerDetail) {
        this.customerDetail = customerDetail;
    }
}
