package com.monash.erp.oms.entity;

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
public class MarketingCampaign extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marketingCampaignId;
    private String parentCampaignId;
    private String statusId;
    private String campaignName;
    private String campaignSummary;
    private BigDecimal budgetedCost;
    private BigDecimal actualCost;
    private BigDecimal estimatedCost;
    private String currencyUomId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String isActive;
    private String convertedLeads;
    private BigDecimal expectedResponsePercent;
    private BigDecimal expectedRevenue;
    private BigDecimal numSent;
    private LocalDateTime startDate;
    private String createdByUserLogin;
    private String lastModifiedByUserLogin;
public void setId(Long id) {
        this.id = id;
    }
public void setMarketingCampaignId(String marketingCampaignId) {
        this.marketingCampaignId = marketingCampaignId;
    }
public void setParentCampaignId(String parentCampaignId) {
        this.parentCampaignId = parentCampaignId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
public void setCampaignSummary(String campaignSummary) {
        this.campaignSummary = campaignSummary;
    }
public void setBudgetedCost(BigDecimal budgetedCost) {
        this.budgetedCost = budgetedCost;
    }
public void setActualCost(BigDecimal actualCost) {
        this.actualCost = actualCost;
    }
public void setEstimatedCost(BigDecimal estimatedCost) {
        this.estimatedCost = estimatedCost;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
public void setConvertedLeads(String convertedLeads) {
        this.convertedLeads = convertedLeads;
    }
public void setExpectedResponsePercent(BigDecimal expectedResponsePercent) {
        this.expectedResponsePercent = expectedResponsePercent;
    }
public void setExpectedRevenue(BigDecimal expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }
public void setNumSent(BigDecimal numSent) {
        this.numSent = numSent;
    }
public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

}
