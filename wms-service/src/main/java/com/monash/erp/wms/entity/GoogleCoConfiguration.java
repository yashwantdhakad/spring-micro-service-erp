package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class GoogleCoConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productStoreId;
    private String merchantId;
    private String merchantKey;
    private String envEnumId;
    private String webSiteId;
    private String prodCatalogId;
    private String currencyUomId;
    private String requestAuthDetails;
    private String requestPhone;
    private String sendPromoItems;
    private String errorOnBadItem;
    private String acceptCoupons;
    private String acceptGiftCerts;
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

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantKey() {
        return merchantKey;
    }

    public void setMerchantKey(String merchantKey) {
        this.merchantKey = merchantKey;
    }

    public String getEnvEnumId() {
        return envEnumId;
    }

    public void setEnvEnumId(String envEnumId) {
        this.envEnumId = envEnumId;
    }

    public String getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }

    public String getProdCatalogId() {
        return prodCatalogId;
    }

    public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getRequestAuthDetails() {
        return requestAuthDetails;
    }

    public void setRequestAuthDetails(String requestAuthDetails) {
        this.requestAuthDetails = requestAuthDetails;
    }

    public String getRequestPhone() {
        return requestPhone;
    }

    public void setRequestPhone(String requestPhone) {
        this.requestPhone = requestPhone;
    }

    public String getSendPromoItems() {
        return sendPromoItems;
    }

    public void setSendPromoItems(String sendPromoItems) {
        this.sendPromoItems = sendPromoItems;
    }

    public String getErrorOnBadItem() {
        return errorOnBadItem;
    }

    public void setErrorOnBadItem(String errorOnBadItem) {
        this.errorOnBadItem = errorOnBadItem;
    }

    public String getAcceptCoupons() {
        return acceptCoupons;
    }

    public void setAcceptCoupons(String acceptCoupons) {
        this.acceptCoupons = acceptCoupons;
    }

    public String getAcceptGiftCerts() {
        return acceptGiftCerts;
    }

    public void setAcceptGiftCerts(String acceptGiftCerts) {
        this.acceptGiftCerts = acceptGiftCerts;
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