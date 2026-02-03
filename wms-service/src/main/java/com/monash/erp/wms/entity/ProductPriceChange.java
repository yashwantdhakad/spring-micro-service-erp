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
public class ProductPriceChange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productPriceChangeId;
    private String productId;
    private String productPriceTypeId;
    private String productPricePurposeId;
    private String currencyUomId;
    private String productStoreGroupId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private BigDecimal price;
    private BigDecimal oldPrice;
    private LocalDateTime changedDate;
    private String changedByUserLogin;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String comments;
public void setId(Long id) {
        this.id = id;
    }
public void setProductPriceChangeId(String productPriceChangeId) {
        this.productPriceChangeId = productPriceChangeId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductPriceTypeId(String productPriceTypeId) {
        this.productPriceTypeId = productPriceTypeId;
    }
public void setProductPricePurposeId(String productPricePurposeId) {
        this.productPricePurposeId = productPricePurposeId;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setProductStoreGroupId(String productStoreGroupId) {
        this.productStoreGroupId = productStoreGroupId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setPrice(BigDecimal price) {
        this.price = price;
    }
public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }
public void setChangedDate(LocalDateTime changedDate) {
        this.changedDate = changedDate;
    }
public void setChangedByUserLogin(String changedByUserLogin) {
        this.changedByUserLogin = changedByUserLogin;
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
public void setComments(String comments) {
        this.comments = comments;
    }

}
