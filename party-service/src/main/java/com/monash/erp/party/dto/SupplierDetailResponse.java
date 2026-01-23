package com.monash.erp.party.dto;

public class SupplierDetailResponse {

    private SupplierDetail supplierDetail;

    public SupplierDetailResponse(SupplierDetail supplierDetail) {
        this.supplierDetail = supplierDetail;
    }

    public SupplierDetail getSupplierDetail() {
        return supplierDetail;
    }

    public void setSupplierDetail(SupplierDetail supplierDetail) {
        this.supplierDetail = supplierDetail;
    }
}
