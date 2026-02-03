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
public class ProductCategoryContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productCategoryId;
    private String contentId;
    private String prodCatContentTypeId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private LocalDateTime purchaseFromDate;
    private LocalDateTime purchaseThruDate;
    private BigDecimal useCountLimit;
    private BigDecimal useDaysLimit;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setProdCatContentTypeId(String prodCatContentTypeId) {
        this.prodCatContentTypeId = prodCatContentTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setPurchaseFromDate(LocalDateTime purchaseFromDate) {
        this.purchaseFromDate = purchaseFromDate;
    }
public void setPurchaseThruDate(LocalDateTime purchaseThruDate) {
        this.purchaseThruDate = purchaseThruDate;
    }
public void setUseCountLimit(BigDecimal useCountLimit) {
        this.useCountLimit = useCountLimit;
    }
public void setUseDaysLimit(BigDecimal useDaysLimit) {
        this.useDaysLimit = useDaysLimit;
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
