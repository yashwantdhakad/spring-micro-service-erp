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
public class ShipmentContactMech {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentId;
    private String shipmentContactMechTypeId;
    private String contactMechId;
public void setId(Long id) {
        this.id = id;
    }
public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
public void setShipmentContactMechTypeId(String shipmentContactMechTypeId) {
        this.shipmentContactMechTypeId = shipmentContactMechTypeId;
    }
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

}
