package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class OrderDeliverySchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemSeqId;
    private LocalDateTime estimatedReadyDate;
    private BigDecimal cartons;
    private BigDecimal skidsPallets;
    private BigDecimal unitsPieces;
    private BigDecimal totalCubicSize;
    private String totalCubicUomId;
    private BigDecimal totalWeight;
    private String totalWeightUomId;
    private String statusId;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public LocalDateTime getEstimatedReadyDate() {
        return estimatedReadyDate;
    }

    public void setEstimatedReadyDate(LocalDateTime estimatedReadyDate) {
        this.estimatedReadyDate = estimatedReadyDate;
    }

    public BigDecimal getCartons() {
        return cartons;
    }

    public void setCartons(BigDecimal cartons) {
        this.cartons = cartons;
    }

    public BigDecimal getSkidsPallets() {
        return skidsPallets;
    }

    public void setSkidsPallets(BigDecimal skidsPallets) {
        this.skidsPallets = skidsPallets;
    }

    public BigDecimal getUnitsPieces() {
        return unitsPieces;
    }

    public void setUnitsPieces(BigDecimal unitsPieces) {
        this.unitsPieces = unitsPieces;
    }

    public BigDecimal getTotalCubicSize() {
        return totalCubicSize;
    }

    public void setTotalCubicSize(BigDecimal totalCubicSize) {
        this.totalCubicSize = totalCubicSize;
    }

    public String getTotalCubicUomId() {
        return totalCubicUomId;
    }

    public void setTotalCubicUomId(String totalCubicUomId) {
        this.totalCubicUomId = totalCubicUomId;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getTotalWeightUomId() {
        return totalWeightUomId;
    }

    public void setTotalWeightUomId(String totalWeightUomId) {
        this.totalWeightUomId = totalWeightUomId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
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