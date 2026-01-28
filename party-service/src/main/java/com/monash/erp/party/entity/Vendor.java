package com.monash.erp.party.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyId;
    private String manifestCompanyName;
    private String manifestCompanyTitle;
    private String manifestLogoUrl;
    private String manifestPolicies;
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

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getManifestCompanyName() {
        return manifestCompanyName;
    }

    public void setManifestCompanyName(String manifestCompanyName) {
        this.manifestCompanyName = manifestCompanyName;
    }

    public String getManifestCompanyTitle() {
        return manifestCompanyTitle;
    }

    public void setManifestCompanyTitle(String manifestCompanyTitle) {
        this.manifestCompanyTitle = manifestCompanyTitle;
    }

    public String getManifestLogoUrl() {
        return manifestLogoUrl;
    }

    public void setManifestLogoUrl(String manifestLogoUrl) {
        this.manifestLogoUrl = manifestLogoUrl;
    }

    public String getManifestPolicies() {
        return manifestPolicies;
    }

    public void setManifestPolicies(String manifestPolicies) {
        this.manifestPolicies = manifestPolicies;
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