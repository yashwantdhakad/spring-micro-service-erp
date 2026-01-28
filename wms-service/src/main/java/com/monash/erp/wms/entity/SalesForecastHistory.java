package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class SalesForecastHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String salesForecastHistoryId;
    private String salesForecastId;
    private String parentSalesForecastId;
    private String organizationPartyId;
    private String internalPartyId;
    private String customTimePeriodId;
    private String currencyUomId;
    private BigDecimal quotaAmount;
    private BigDecimal forecastAmount;
    private BigDecimal bestCaseAmount;
    private BigDecimal closedAmount;
    private BigDecimal percentOfQuotaForecast;
    private BigDecimal percentOfQuotaClosed;
    private String changeNote;
    private String modifiedByUserLoginId;
    private LocalDateTime modifiedTimestamp;
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

    public String getSalesForecastHistoryId() {
        return salesForecastHistoryId;
    }

    public void setSalesForecastHistoryId(String salesForecastHistoryId) {
        this.salesForecastHistoryId = salesForecastHistoryId;
    }

    public String getSalesForecastId() {
        return salesForecastId;
    }

    public void setSalesForecastId(String salesForecastId) {
        this.salesForecastId = salesForecastId;
    }

    public String getParentSalesForecastId() {
        return parentSalesForecastId;
    }

    public void setParentSalesForecastId(String parentSalesForecastId) {
        this.parentSalesForecastId = parentSalesForecastId;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public String getInternalPartyId() {
        return internalPartyId;
    }

    public void setInternalPartyId(String internalPartyId) {
        this.internalPartyId = internalPartyId;
    }

    public String getCustomTimePeriodId() {
        return customTimePeriodId;
    }

    public void setCustomTimePeriodId(String customTimePeriodId) {
        this.customTimePeriodId = customTimePeriodId;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public BigDecimal getQuotaAmount() {
        return quotaAmount;
    }

    public void setQuotaAmount(BigDecimal quotaAmount) {
        this.quotaAmount = quotaAmount;
    }

    public BigDecimal getForecastAmount() {
        return forecastAmount;
    }

    public void setForecastAmount(BigDecimal forecastAmount) {
        this.forecastAmount = forecastAmount;
    }

    public BigDecimal getBestCaseAmount() {
        return bestCaseAmount;
    }

    public void setBestCaseAmount(BigDecimal bestCaseAmount) {
        this.bestCaseAmount = bestCaseAmount;
    }

    public BigDecimal getClosedAmount() {
        return closedAmount;
    }

    public void setClosedAmount(BigDecimal closedAmount) {
        this.closedAmount = closedAmount;
    }

    public BigDecimal getPercentOfQuotaForecast() {
        return percentOfQuotaForecast;
    }

    public void setPercentOfQuotaForecast(BigDecimal percentOfQuotaForecast) {
        this.percentOfQuotaForecast = percentOfQuotaForecast;
    }

    public BigDecimal getPercentOfQuotaClosed() {
        return percentOfQuotaClosed;
    }

    public void setPercentOfQuotaClosed(BigDecimal percentOfQuotaClosed) {
        this.percentOfQuotaClosed = percentOfQuotaClosed;
    }

    public String getChangeNote() {
        return changeNote;
    }

    public void setChangeNote(String changeNote) {
        this.changeNote = changeNote;
    }

    public String getModifiedByUserLoginId() {
        return modifiedByUserLoginId;
    }

    public void setModifiedByUserLoginId(String modifiedByUserLoginId) {
        this.modifiedByUserLoginId = modifiedByUserLoginId;
    }

    public LocalDateTime getModifiedTimestamp() {
        return modifiedTimestamp;
    }

    public void setModifiedTimestamp(LocalDateTime modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
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