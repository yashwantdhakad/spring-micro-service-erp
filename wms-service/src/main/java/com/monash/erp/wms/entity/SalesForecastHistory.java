package com.monash.erp.wms.entity;

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
public void setId(Long id) {
        this.id = id;
    }
public void setSalesForecastHistoryId(String salesForecastHistoryId) {
        this.salesForecastHistoryId = salesForecastHistoryId;
    }
public void setSalesForecastId(String salesForecastId) {
        this.salesForecastId = salesForecastId;
    }
public void setParentSalesForecastId(String parentSalesForecastId) {
        this.parentSalesForecastId = parentSalesForecastId;
    }
public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
public void setInternalPartyId(String internalPartyId) {
        this.internalPartyId = internalPartyId;
    }
public void setCustomTimePeriodId(String customTimePeriodId) {
        this.customTimePeriodId = customTimePeriodId;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setQuotaAmount(BigDecimal quotaAmount) {
        this.quotaAmount = quotaAmount;
    }
public void setForecastAmount(BigDecimal forecastAmount) {
        this.forecastAmount = forecastAmount;
    }
public void setBestCaseAmount(BigDecimal bestCaseAmount) {
        this.bestCaseAmount = bestCaseAmount;
    }
public void setClosedAmount(BigDecimal closedAmount) {
        this.closedAmount = closedAmount;
    }
public void setPercentOfQuotaForecast(BigDecimal percentOfQuotaForecast) {
        this.percentOfQuotaForecast = percentOfQuotaForecast;
    }
public void setPercentOfQuotaClosed(BigDecimal percentOfQuotaClosed) {
        this.percentOfQuotaClosed = percentOfQuotaClosed;
    }
public void setChangeNote(String changeNote) {
        this.changeNote = changeNote;
    }
public void setModifiedByUserLoginId(String modifiedByUserLoginId) {
        this.modifiedByUserLoginId = modifiedByUserLoginId;
    }
public void setModifiedTimestamp(LocalDateTime modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
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
