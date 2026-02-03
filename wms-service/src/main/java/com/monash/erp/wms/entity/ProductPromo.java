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
public class ProductPromo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productPromoId;
    private String promoName;
    private String promoText;
    private String userEntered;
    private String showToCustomer;
    private String requireCode;
    private BigDecimal useLimitPerOrder;
    private BigDecimal useLimitPerCustomer;
    private BigDecimal useLimitPerPromotion;
    private BigDecimal billbackFactor;
    private String overrideOrgPartyId;
    private LocalDateTime createdDate;
    private String createdByUserLogin;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedByUserLogin;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId;
    }
public void setPromoName(String promoName) {
        this.promoName = promoName;
    }
public void setPromoText(String promoText) {
        this.promoText = promoText;
    }
public void setUserEntered(String userEntered) {
        this.userEntered = userEntered;
    }
public void setShowToCustomer(String showToCustomer) {
        this.showToCustomer = showToCustomer;
    }
public void setRequireCode(String requireCode) {
        this.requireCode = requireCode;
    }
public void setUseLimitPerOrder(BigDecimal useLimitPerOrder) {
        this.useLimitPerOrder = useLimitPerOrder;
    }
public void setUseLimitPerCustomer(BigDecimal useLimitPerCustomer) {
        this.useLimitPerCustomer = useLimitPerCustomer;
    }
public void setUseLimitPerPromotion(BigDecimal useLimitPerPromotion) {
        this.useLimitPerPromotion = useLimitPerPromotion;
    }
public void setBillbackFactor(BigDecimal billbackFactor) {
        this.billbackFactor = billbackFactor;
    }
public void setOverrideOrgPartyId(String overrideOrgPartyId) {
        this.overrideOrgPartyId = overrideOrgPartyId;
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
