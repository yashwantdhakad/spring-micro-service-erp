package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class GlReconciliation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glReconciliationId;

    private String glReconciliationName;

    private String description;

    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;

    private String glAccountId;

    private String statusId;

    private String organizationPartyId;

    private BigDecimal reconciledBalance;

    private BigDecimal openingBalance;

    private LocalDateTime reconciledDate;
public void setId(Long id) {
        this.id = id;
    }
public void setGlReconciliationId(String glReconciliationId) {
        this.glReconciliationId = glReconciliationId;
    }
public void setGlReconciliationName(String glReconciliationName) {
        this.glReconciliationName = glReconciliationName;
    }
public void setDescription(String description) {
        this.description = description;
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
public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
public void setReconciledBalance(BigDecimal reconciledBalance) {
        this.reconciledBalance = reconciledBalance;
    }
public void setOpeningBalance(BigDecimal openingBalance) {
        this.openingBalance = openingBalance;
    }
public void setReconciledDate(LocalDateTime reconciledDate) {
        this.reconciledDate = reconciledDate;
    }
}
