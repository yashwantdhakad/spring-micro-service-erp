package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getOriginFacilityId() {
        return originFacilityId;
    }

    public void setOriginFacilityId(String originFacilityId) {
        this.originFacilityId = originFacilityId;
    }

    public String getDestFacilityId() {
        return destFacilityId;
    }

    public void setDestFacilityId(String destFacilityId) {
        this.destFacilityId = destFacilityId;
    }

    public LocalDateTime getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(LocalDateTime actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public LocalDateTime getActualArrivalDate() {
        return actualArrivalDate;
    }

    public void setActualArrivalDate(LocalDateTime actualArrivalDate) {
        this.actualArrivalDate = actualArrivalDate;
    }

    public LocalDateTime getEstimatedStartDate() {
        return estimatedStartDate;
    }

    public void setEstimatedStartDate(LocalDateTime estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }

    public LocalDateTime getEstimatedArrivalDate() {
        return estimatedArrivalDate;
    }

    public void setEstimatedArrivalDate(LocalDateTime estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }

    public String getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public BigDecimal getStartMileage() {
        return startMileage;
    }

    public void setStartMileage(BigDecimal startMileage) {
        this.startMileage = startMileage;
    }

    public BigDecimal getEndMileage() {
        return endMileage;
    }

    public void setEndMileage(BigDecimal endMileage) {
        this.endMileage = endMileage;
    }

    public BigDecimal getFuelUsed() {
        return fuelUsed;
    }

    public void setFuelUsed(BigDecimal fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    public LocalDateTime getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public LocalDateTime getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public LocalDateTime getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }

    public LocalDateTime getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}