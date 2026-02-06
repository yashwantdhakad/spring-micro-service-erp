package com.monash.erp.party.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "party",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_party_party_id", columnNames = "party_id")
        },
        indexes = {
                @Index(name = "idx_party_party_id", columnList = "party_id"),
                @Index(name = "idx_party_party_type_id", columnList = "party_type_id"),
                @Index(name = "idx_party_status_id", columnList = "status_id"),
                @Index(name = "idx_party_external_id", columnList = "external_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyId;
    private String partyTypeId;
    private String externalId;
    private String preferredCurrencyUomId;
    private String description;
    private String statusId;
    private LocalDateTime createdDate;
    private String createdByUserLogin;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedByUserLogin;
    private String dataSourceId;
    private String isUnread;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    @Column(name = "APPROVED_P_M_A")
    private String approvedPMa;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setPartyTypeId(String partyTypeId) {
        this.partyTypeId = partyTypeId;
    }
public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
public void setPreferredCurrencyUomId(String preferredCurrencyUomId) {
        this.preferredCurrencyUomId = preferredCurrencyUomId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }
public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
public void setIsUnread(String isUnread) {
        this.isUnread = isUnread;
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
public void setApprovedPMa(String approvedPMa) {
        this.approvedPMa = approvedPMa;
    }

}
