package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
public void setMerchantKey(String merchantKey) {
        this.merchantKey = merchantKey;
    }
public void setEnvEnumId(String envEnumId) {
        this.envEnumId = envEnumId;
    }
public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }
public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setRequestAuthDetails(String requestAuthDetails) {
        this.requestAuthDetails = requestAuthDetails;
    }
public void setRequestPhone(String requestPhone) {
        this.requestPhone = requestPhone;
    }
public void setSendPromoItems(String sendPromoItems) {
        this.sendPromoItems = sendPromoItems;
    }
public void setErrorOnBadItem(String errorOnBadItem) {
        this.errorOnBadItem = errorOnBadItem;
    }
public void setAcceptCoupons(String acceptCoupons) {
        this.acceptCoupons = acceptCoupons;
    }
public void setAcceptGiftCerts(String acceptGiftCerts) {
        this.acceptGiftCerts = acceptGiftCerts;
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
