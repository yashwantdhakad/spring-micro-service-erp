package com.example.erp.wms.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShipmentPackageContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentId;
    private String shipmentPackageSeqId;
    private String shipmentItemSeqId;
    private String quantity;
    private String subProductId;
    private String subProductQuantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentPackageSeqId() {
        return shipmentPackageSeqId;
    }

    public void setShipmentPackageSeqId(String shipmentPackageSeqId) {
        this.shipmentPackageSeqId = shipmentPackageSeqId;
    }

    public String getShipmentItemSeqId() {
        return shipmentItemSeqId;
    }

    public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSubProductId() {
        return subProductId;
    }

    public void setSubProductId(String subProductId) {
        this.subProductId = subProductId;
    }

    public String getSubProductQuantity() {
        return subProductQuantity;
    }

    public void setSubProductQuantity(String subProductQuantity) {
        this.subProductQuantity = subProductQuantity;
    }

}