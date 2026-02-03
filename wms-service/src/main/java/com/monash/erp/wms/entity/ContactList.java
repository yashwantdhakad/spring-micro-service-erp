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
public class ContactList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contactListId;
    private String contactListTypeId;
    private String contactMechTypeId;
    private String marketingCampaignId;
    private String contactListName;
    private String description;
    private String comments;
    private String isPublic;
    private String singleUse;
    private String ownerPartyId;
    private String verifyEmailFrom;
    private String verifyEmailScreen;
    private String verifyEmailSubject;
    private String verifyEmailWebSiteId;
    private String optOutScreen;
    private String createdByUserLogin;
    private String lastModifiedByUserLogin;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setContactListId(String contactListId) {
        this.contactListId = contactListId;
    }
public void setContactListTypeId(String contactListTypeId) {
        this.contactListTypeId = contactListTypeId;
    }
public void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }
public void setMarketingCampaignId(String marketingCampaignId) {
        this.marketingCampaignId = marketingCampaignId;
    }
public void setContactListName(String contactListName) {
        this.contactListName = contactListName;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }
public void setSingleUse(String singleUse) {
        this.singleUse = singleUse;
    }
public void setOwnerPartyId(String ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }
public void setVerifyEmailFrom(String verifyEmailFrom) {
        this.verifyEmailFrom = verifyEmailFrom;
    }
public void setVerifyEmailScreen(String verifyEmailScreen) {
        this.verifyEmailScreen = verifyEmailScreen;
    }
public void setVerifyEmailSubject(String verifyEmailSubject) {
        this.verifyEmailSubject = verifyEmailSubject;
    }
public void setVerifyEmailWebSiteId(String verifyEmailWebSiteId) {
        this.verifyEmailWebSiteId = verifyEmailWebSiteId;
    }
public void setOptOutScreen(String optOutScreen) {
        this.optOutScreen = optOutScreen;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
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
