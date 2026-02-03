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
public void setId(Long id) {
        this.id = id;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setPhysicalInventoryId(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }
public void setVarianceReasonId(String varianceReasonId) {
        this.varianceReasonId = varianceReasonId;
    }
public void setAvailableToPromiseVar(String availableToPromiseVar) {
        this.availableToPromiseVar = availableToPromiseVar;
    }
public void setQuantityOnHandVar(String quantityOnHandVar) {
        this.quantityOnHandVar = quantityOnHandVar;
    }
public void setComments(String comments) {
        this.comments = comments;
    }

}
