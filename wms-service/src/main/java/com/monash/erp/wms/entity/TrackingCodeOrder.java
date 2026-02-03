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
public class TrackingCodeOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String trackingCodeTypeId;
    private String trackingCodeId;
    private String isBillable;
    private String siteId;
    private String hasExported;
    private LocalDateTime affiliateReferredTimeStamp;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setTrackingCodeTypeId(String trackingCodeTypeId) {
        this.trackingCodeTypeId = trackingCodeTypeId;
    }
public void setTrackingCodeId(String trackingCodeId) {
        this.trackingCodeId = trackingCodeId;
    }
public void setIsBillable(String isBillable) {
        this.isBillable = isBillable;
    }
public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
public void setHasExported(String hasExported) {
        this.hasExported = hasExported;
    }
public void setAffiliateReferredTimeStamp(LocalDateTime affiliateReferredTimeStamp) {
        this.affiliateReferredTimeStamp = affiliateReferredTimeStamp;
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
