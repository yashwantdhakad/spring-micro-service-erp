package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class ProductCalculatedInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;
    private BigDecimal totalQuantityOrdered;
    private BigDecimal totalTimesViewed;
    private BigDecimal averageCustomerRating;
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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getTotalQuantityOrdered() {
        return totalQuantityOrdered;
    }

    public void setTotalQuantityOrdered(BigDecimal totalQuantityOrdered) {
        this.totalQuantityOrdered = totalQuantityOrdered;
    }

    public BigDecimal getTotalTimesViewed() {
        return totalTimesViewed;
    }

    public void setTotalTimesViewed(BigDecimal totalTimesViewed) {
        this.totalTimesViewed = totalTimesViewed;
    }

    public BigDecimal getAverageCustomerRating() {
        return averageCustomerRating;
    }

    public void setAverageCustomerRating(BigDecimal averageCustomerRating) {
        this.averageCustomerRating = averageCustomerRating;
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