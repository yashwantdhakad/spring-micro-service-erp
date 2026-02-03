package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class ProductFacilityCondition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;
    private String facilityId;
    private String itemCondition;
    private BigDecimal minimumStock;
    private BigDecimal reorderQuantity;
    private BigDecimal daysToShip;
    private LocalDateTime purchaseDiscontinuationDate;
    private String forecastingEnumId;
    private LocalDateTime createdDate;
    private String createdByUserLogin;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedByUserLogin;
    private BigDecimal lastInventoryCount;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }
public void setMinimumStock(BigDecimal minimumStock) {
        this.minimumStock = minimumStock;
    }
public void setReorderQuantity(BigDecimal reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }
public void setDaysToShip(BigDecimal daysToShip) {
        this.daysToShip = daysToShip;
    }
public void setPurchaseDiscontinuationDate(LocalDateTime purchaseDiscontinuationDate) {
        this.purchaseDiscontinuationDate = purchaseDiscontinuationDate;
    }
public void setForecastingEnumId(String forecastingEnumId) {
        this.forecastingEnumId = forecastingEnumId;
    }
public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }
public void setLastInventoryCount(BigDecimal lastInventoryCount) {
        this.lastInventoryCount = lastInventoryCount;
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
