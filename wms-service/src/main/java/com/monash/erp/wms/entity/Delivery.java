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
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String deliveryId;
    private String originFacilityId;
    private String destFacilityId;
    private LocalDateTime actualStartDate;
    private LocalDateTime actualArrivalDate;
    private LocalDateTime estimatedStartDate;
    private LocalDateTime estimatedArrivalDate;
    private String fixedAssetId;
    private BigDecimal startMileage;
    private BigDecimal endMileage;
    private BigDecimal fuelUsed;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }
public void setOriginFacilityId(String originFacilityId) {
        this.originFacilityId = originFacilityId;
    }
public void setDestFacilityId(String destFacilityId) {
        this.destFacilityId = destFacilityId;
    }
public void setActualStartDate(LocalDateTime actualStartDate) {
        this.actualStartDate = actualStartDate;
    }
public void setActualArrivalDate(LocalDateTime actualArrivalDate) {
        this.actualArrivalDate = actualArrivalDate;
    }
public void setEstimatedStartDate(LocalDateTime estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }
public void setEstimatedArrivalDate(LocalDateTime estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setStartMileage(BigDecimal startMileage) {
        this.startMileage = startMileage;
    }
public void setEndMileage(BigDecimal endMileage) {
        this.endMileage = endMileage;
    }
public void setFuelUsed(BigDecimal fuelUsed) {
        this.fuelUsed = fuelUsed;
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
