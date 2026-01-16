package com.example.erp.wms.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShipmentGatewayConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentGatewayConfigId;
    private String shipmentGatewayConfTypeId;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShipmentGatewayConfigId() {
        return shipmentGatewayConfigId;
    }

    public void setShipmentGatewayConfigId(String shipmentGatewayConfigId) {
        this.shipmentGatewayConfigId = shipmentGatewayConfigId;
    }

    public String getShipmentGatewayConfTypeId() {
        return shipmentGatewayConfTypeId;
    }

    public void setShipmentGatewayConfTypeId(String shipmentGatewayConfTypeId) {
        this.shipmentGatewayConfTypeId = shipmentGatewayConfTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}