package com.example.erp.wms.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShipmentGatewayConfigType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentGatewayConfTypeId;
    private String parentTypeId;
    private String hasTable;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShipmentGatewayConfTypeId() {
        return shipmentGatewayConfTypeId;
    }

    public void setShipmentGatewayConfTypeId(String shipmentGatewayConfTypeId) {
        this.shipmentGatewayConfTypeId = shipmentGatewayConfTypeId;
    }

    public String getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public String getHasTable() {
        return hasTable;
    }

    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}