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
public void setId(Long id) {
        this.id = id;
    }
public void setAddendumId(String addendumId) {
        this.addendumId = addendumId;
    }
public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }
public void setAgreementItemSeqId(String agreementItemSeqId) {
        this.agreementItemSeqId = agreementItemSeqId;
    }
public void setAddendumCreationDate(LocalDateTime addendumCreationDate) {
        this.addendumCreationDate = addendumCreationDate;
    }
public void setAddendumEffectiveDate(LocalDateTime addendumEffectiveDate) {
        this.addendumEffectiveDate = addendumEffectiveDate;
    }
public void setAddendumText(String addendumText) {
        this.addendumText = addendumText;
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
