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
public class Affiliate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyId;
    private String affiliateName;
    private String affiliateDescription;
    private String yearEstablished;
    private String siteType;
    private String sitePageViews;
    private String siteVisitors;
    private LocalDateTime dateTimeCreated;
    private LocalDateTime dateTimeApproved;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setAffiliateName(String affiliateName) {
        this.affiliateName = affiliateName;
    }
public void setAffiliateDescription(String affiliateDescription) {
        this.affiliateDescription = affiliateDescription;
    }
public void setYearEstablished(String yearEstablished) {
        this.yearEstablished = yearEstablished;
    }
public void setSiteType(String siteType) {
        this.siteType = siteType;
    }
public void setSitePageViews(String sitePageViews) {
        this.sitePageViews = sitePageViews;
    }
public void setSiteVisitors(String siteVisitors) {
        this.siteVisitors = siteVisitors;
    }
public void setDateTimeCreated(LocalDateTime dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }
public void setDateTimeApproved(LocalDateTime dateTimeApproved) {
        this.dateTimeApproved = dateTimeApproved;
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
