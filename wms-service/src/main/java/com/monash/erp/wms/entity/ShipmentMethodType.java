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
public class ShipmentMethodType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentMethodTypeId;
    private String description;
    private String sequenceNum;
public void setId(Long id) {
        this.id = id;
    }
public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

}
