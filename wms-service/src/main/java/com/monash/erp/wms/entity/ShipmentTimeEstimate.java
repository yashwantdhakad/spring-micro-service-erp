package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class ShipmentTimeEstimate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentMethodTypeId;
    private String partyId;
    private String roleTypeId;
    private String geoIdTo;
    private String geoIdFrom;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String leadTime;
    private String leadTimeUomId;
    private String sequenceNumber;
public void setId(Long id) {
        this.id = id;
    }
public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setGeoIdTo(String geoIdTo) {
        this.geoIdTo = geoIdTo;
    }
public void setGeoIdFrom(String geoIdFrom) {
        this.geoIdFrom = geoIdFrom;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setLeadTime(String leadTime) {
        this.leadTime = leadTime;
    }
public void setLeadTimeUomId(String leadTimeUomId) {
        this.leadTimeUomId = leadTimeUomId;
    }
public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

}
