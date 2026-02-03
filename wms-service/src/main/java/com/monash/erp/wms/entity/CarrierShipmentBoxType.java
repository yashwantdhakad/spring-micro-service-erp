package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class CarrierShipmentBoxType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentBoxTypeId;
    private String partyId;
    private String packagingTypeCode;
    private String oversizeCode;
public void setId(Long id) {
        this.id = id;
    }
public void setShipmentBoxTypeId(String shipmentBoxTypeId) {
        this.shipmentBoxTypeId = shipmentBoxTypeId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setPackagingTypeCode(String packagingTypeCode) {
        this.packagingTypeCode = packagingTypeCode;
    }
public void setOversizeCode(String oversizeCode) {
        this.oversizeCode = oversizeCode;
    }

}
