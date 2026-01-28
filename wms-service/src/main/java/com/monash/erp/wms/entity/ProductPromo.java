package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductPromoId() {
        return productPromoId;
    }

    public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public String getPromoText() {
        return promoText;
    }

    public void setPromoText(String promoText) {
        this.promoText = promoText;
    }

    public String getUserEntered() {
        return userEntered;
    }

    public void setUserEntered(String userEntered) {
        this.userEntered = userEntered;
    }

    public String getShowToCustomer() {
        return showToCustomer;
    }

    public void setShowToCustomer(String showToCustomer) {
        this.showToCustomer = showToCustomer;
    }

    public String getRequireCode() {
        return requireCode;
    }

    public void setRequireCode(String requireCode) {
        this.requireCode = requireCode;
    }

    public BigDecimal getUseLimitPerOrder() {
        return useLimitPerOrder;
    }

    public void setUseLimitPerOrder(BigDecimal useLimitPerOrder) {
        this.useLimitPerOrder = useLimitPerOrder;
    }

    public BigDecimal getUseLimitPerCustomer() {
        return useLimitPerCustomer;
    }

    public void setUseLimitPerCustomer(BigDecimal useLimitPerCustomer) {
        this.useLimitPerCustomer = useLimitPerCustomer;
    }

    public BigDecimal getUseLimitPerPromotion() {
        return useLimitPerPromotion;
    }

    public void setUseLimitPerPromotion(BigDecimal useLimitPerPromotion) {
        this.useLimitPerPromotion = useLimitPerPromotion;
    }

    public BigDecimal getBillbackFactor() {
        return billbackFactor;
    }

    public void setBillbackFactor(BigDecimal billbackFactor) {
        this.billbackFactor = billbackFactor;
    }

    public String getOverrideOrgPartyId() {
        return overrideOrgPartyId;
    }

    public void setOverrideOrgPartyId(String overrideOrgPartyId) {
        this.overrideOrgPartyId = overrideOrgPartyId;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
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