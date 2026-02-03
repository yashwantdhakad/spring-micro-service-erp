package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class GlAccountHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glAccountId;

    private String organizationPartyId;

    private String customTimePeriodId;

    private BigDecimal openingBalance;

    private BigDecimal postedDebits;

    private BigDecimal postedCredits;

    private BigDecimal endingBalance;
public void setId(Long id) {
        this.id = id;
    }
public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
public void setCustomTimePeriodId(String customTimePeriodId) {
        this.customTimePeriodId = customTimePeriodId;
    }
public void setOpeningBalance(BigDecimal openingBalance) {
        this.openingBalance = openingBalance;
    }
public void setPostedDebits(BigDecimal postedDebits) {
        this.postedDebits = postedDebits;
    }
public void setPostedCredits(BigDecimal postedCredits) {
        this.postedCredits = postedCredits;
    }
public void setEndingBalance(BigDecimal endingBalance) {
        this.endingBalance = endingBalance;
    }
}
