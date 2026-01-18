package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public String getGeoIdTo() {
        return geoIdTo;
    }

    public void setGeoIdTo(String geoIdTo) {
        this.geoIdTo = geoIdTo;
    }

    public String getGeoIdFrom() {
        return geoIdFrom;
    }

    public void setGeoIdFrom(String geoIdFrom) {
        this.geoIdFrom = geoIdFrom;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

    public String getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(String leadTime) {
        this.leadTime = leadTime;
    }

    public String getLeadTimeUomId() {
        return leadTimeUomId;
    }

    public void setLeadTimeUomId(String leadTimeUomId) {
        this.leadTimeUomId = leadTimeUomId;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

}