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
public class ProductFacilityLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;
    private String facilityId;
    private String locationSeqId;
    private String minimumStock;
    private String moveQuantity;
public void setId(Long id) {
        this.id = id;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }
public void setMinimumStock(String minimumStock) {
        this.minimumStock = minimumStock;
    }
public void setMoveQuantity(String moveQuantity) {
        this.moveQuantity = moveQuantity;
    }

}
