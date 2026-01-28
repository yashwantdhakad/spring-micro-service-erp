package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class FixedAssetTypeGlAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fixedAssetTypeId;
    private String fixedAssetId;
    private String organizationPartyId;
    private String assetGlAccountId;
    private String accDepGlAccountId;
    private String depGlAccountId;
    private String profitGlAccountId;
    private String lossGlAccountId;
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

    public String getFixedAssetTypeId() {
        return fixedAssetTypeId;
    }

    public void setFixedAssetTypeId(String fixedAssetTypeId) {
        this.fixedAssetTypeId = fixedAssetTypeId;
    }

    public String getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public String getAssetGlAccountId() {
        return assetGlAccountId;
    }

    public void setAssetGlAccountId(String assetGlAccountId) {
        this.assetGlAccountId = assetGlAccountId;
    }

    public String getAccDepGlAccountId() {
        return accDepGlAccountId;
    }

    public void setAccDepGlAccountId(String accDepGlAccountId) {
        this.accDepGlAccountId = accDepGlAccountId;
    }

    public String getDepGlAccountId() {
        return depGlAccountId;
    }

    public void setDepGlAccountId(String depGlAccountId) {
        this.depGlAccountId = depGlAccountId;
    }

    public String getProfitGlAccountId() {
        return profitGlAccountId;
    }

    public void setProfitGlAccountId(String profitGlAccountId) {
        this.profitGlAccountId = profitGlAccountId;
    }

    public String getLossGlAccountId() {
        return lossGlAccountId;
    }

    public void setLossGlAccountId(String lossGlAccountId) {
        this.lossGlAccountId = lossGlAccountId;
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