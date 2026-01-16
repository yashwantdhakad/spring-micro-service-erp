package com.example.erp.wms.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarrierShipmentBoxType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentBoxTypeId;
    private String partyId;
    private String packagingTypeCode;
    private String oversizeCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShipmentBoxTypeId() {
        return shipmentBoxTypeId;
    }

    public void setShipmentBoxTypeId(String shipmentBoxTypeId) {
        this.shipmentBoxTypeId = shipmentBoxTypeId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getPackagingTypeCode() {
        return packagingTypeCode;
    }

    public void setPackagingTypeCode(String packagingTypeCode) {
        this.packagingTypeCode = packagingTypeCode;
    }

    public String getOversizeCode() {
        return oversizeCode;
    }

    public void setOversizeCode(String oversizeCode) {
        this.oversizeCode = oversizeCode;
    }

}