package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InventoryItemVariance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String inventoryItemId;
    private String physicalInventoryId;
    private String varianceReasonId;
    private String availableToPromiseVar;
    private String quantityOnHandVar;
    private String comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getPhysicalInventoryId() {
        return physicalInventoryId;
    }

    public void setPhysicalInventoryId(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }

    public String getVarianceReasonId() {
        return varianceReasonId;
    }

    public void setVarianceReasonId(String varianceReasonId) {
        this.varianceReasonId = varianceReasonId;
    }

    public String getAvailableToPromiseVar() {
        return availableToPromiseVar;
    }

    public void setAvailableToPromiseVar(String availableToPromiseVar) {
        this.availableToPromiseVar = availableToPromiseVar;
    }

    public String getQuantityOnHandVar() {
        return quantityOnHandVar;
    }

    public void setQuantityOnHandVar(String quantityOnHandVar) {
        this.quantityOnHandVar = quantityOnHandVar;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}