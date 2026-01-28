package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Addendum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String addendumId;
    private String agreementId;
    private String agreementItemSeqId;
    private LocalDateTime addendumCreationDate;
    private LocalDateTime addendumEffectiveDate;
    private String addendumText;
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

    public String getAddendumId() {
        return addendumId;
    }

    public void setAddendumId(String addendumId) {
        this.addendumId = addendumId;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public String getAgreementItemSeqId() {
        return agreementItemSeqId;
    }

    public void setAgreementItemSeqId(String agreementItemSeqId) {
        this.agreementItemSeqId = agreementItemSeqId;
    }

    public LocalDateTime getAddendumCreationDate() {
        return addendumCreationDate;
    }

    public void setAddendumCreationDate(LocalDateTime addendumCreationDate) {
        this.addendumCreationDate = addendumCreationDate;
    }

    public LocalDateTime getAddendumEffectiveDate() {
        return addendumEffectiveDate;
    }

    public void setAddendumEffectiveDate(LocalDateTime addendumEffectiveDate) {
        this.addendumEffectiveDate = addendumEffectiveDate;
    }

    public String getAddendumText() {
        return addendumText;
    }

    public void setAddendumText(String addendumText) {
        this.addendumText = addendumText;
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