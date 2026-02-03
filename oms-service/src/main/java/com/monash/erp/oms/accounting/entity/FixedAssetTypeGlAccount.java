package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
}
