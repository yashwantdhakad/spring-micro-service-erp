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
public void setId(Long id) {
        this.id = id;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setMinimumStock(String minimumStock) {
        this.minimumStock = minimumStock;
    }
public void setReorderQuantity(String reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }
public void setDaysToShip(String daysToShip) {
        this.daysToShip = daysToShip;
    }
public void setReplenishMethodEnumId(String replenishMethodEnumId) {
        this.replenishMethodEnumId = replenishMethodEnumId;
    }
public void setLastInventoryCount(String lastInventoryCount) {
        this.lastInventoryCount = lastInventoryCount;
    }
public void setRequirementMethodEnumId(String requirementMethodEnumId) {
        this.requirementMethodEnumId = requirementMethodEnumId;
    }

}
