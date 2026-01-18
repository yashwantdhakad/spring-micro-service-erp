package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductFacility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;
    private String facilityId;
    private String minimumStock;
    private String reorderQuantity;
    private String daysToShip;
    private String replenishMethodEnumId;
    private String lastInventoryCount;
    private String requirementMethodEnumId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(String minimumStock) {
        this.minimumStock = minimumStock;
    }

    public String getReorderQuantity() {
        return reorderQuantity;
    }

    public void setReorderQuantity(String reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }

    public String getDaysToShip() {
        return daysToShip;
    }

    public void setDaysToShip(String daysToShip) {
        this.daysToShip = daysToShip;
    }

    public String getReplenishMethodEnumId() {
        return replenishMethodEnumId;
    }

    public void setReplenishMethodEnumId(String replenishMethodEnumId) {
        this.replenishMethodEnumId = replenishMethodEnumId;
    }

    public String getLastInventoryCount() {
        return lastInventoryCount;
    }

    public void setLastInventoryCount(String lastInventoryCount) {
        this.lastInventoryCount = lastInventoryCount;
    }

    public String getRequirementMethodEnumId() {
        return requirementMethodEnumId;
    }

    public void setRequirementMethodEnumId(String requirementMethodEnumId) {
        this.requirementMethodEnumId = requirementMethodEnumId;
    }

}