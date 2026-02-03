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
public class SalesForecastDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String salesForecastId;
    private String salesForecastDetailId;
    private BigDecimal amount;
    private String quantityUomId;
    private BigDecimal quantity;
    private String productId;
    private String productCategoryId;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setSalesForecastId(String salesForecastId) {
        this.salesForecastId = salesForecastId;
    }
public void setSalesForecastDetailId(String salesForecastDetailId) {
        this.salesForecastDetailId = salesForecastDetailId;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
public void setQuantityUomId(String quantityUomId) {
        this.quantityUomId = quantityUomId;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
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
