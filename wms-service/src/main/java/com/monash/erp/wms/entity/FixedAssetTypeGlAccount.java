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
public void setId(Long id) {
        this.id = id;
    }
public void setFixedAssetTypeId(String fixedAssetTypeId) {
        this.fixedAssetTypeId = fixedAssetTypeId;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
public void setAssetGlAccountId(String assetGlAccountId) {
        this.assetGlAccountId = assetGlAccountId;
    }
public void setAccDepGlAccountId(String accDepGlAccountId) {
        this.accDepGlAccountId = accDepGlAccountId;
    }
public void setDepGlAccountId(String depGlAccountId) {
        this.depGlAccountId = depGlAccountId;
    }
public void setProfitGlAccountId(String profitGlAccountId) {
        this.profitGlAccountId = profitGlAccountId;
    }
public void setLossGlAccountId(String lossGlAccountId) {
        this.lossGlAccountId = lossGlAccountId;
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
