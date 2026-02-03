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
public class ProductDimension {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dimensionId;
    private String productId;
    private String productType;
    private String brandName;
    private String internalName;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setDimensionId(String dimensionId) {
        this.dimensionId = dimensionId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductType(String productType) {
        this.productType = productType;
    }
public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
public void setInternalName(String internalName) {
        this.internalName = internalName;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}
