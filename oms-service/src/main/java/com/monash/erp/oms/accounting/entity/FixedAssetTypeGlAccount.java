package com.monash.erp.oms.accounting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
}
