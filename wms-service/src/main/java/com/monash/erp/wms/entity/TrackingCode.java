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
public class TrackingCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trackingCodeId;
    private String trackingCodeTypeId;
    private String marketingCampaignId;
    private String redirectUrl;
    private String overrideLogo;
    private String overrideCss;
    private String prodCatalogId;
    private String comments;
    private String description;
    private BigDecimal trackableLifetime;
    private BigDecimal billableLifetime;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String groupId;
    private String subgroupId;
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
public void setTrackingCodeId(String trackingCodeId) {
        this.trackingCodeId = trackingCodeId;
    }
public void setTrackingCodeTypeId(String trackingCodeTypeId) {
        this.trackingCodeTypeId = trackingCodeTypeId;
    }
public void setMarketingCampaignId(String marketingCampaignId) {
        this.marketingCampaignId = marketingCampaignId;
    }
public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
public void setOverrideLogo(String overrideLogo) {
        this.overrideLogo = overrideLogo;
    }
public void setOverrideCss(String overrideCss) {
        this.overrideCss = overrideCss;
    }
public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setTrackableLifetime(BigDecimal trackableLifetime) {
        this.trackableLifetime = trackableLifetime;
    }
public void setBillableLifetime(BigDecimal billableLifetime) {
        this.billableLifetime = billableLifetime;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
public void setSubgroupId(String subgroupId) {
        this.subgroupId = subgroupId;
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
