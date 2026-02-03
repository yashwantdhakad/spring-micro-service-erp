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
public class SalesOpportunityHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String salesOpportunityHistoryId;
    private String salesOpportunityId;
    private String description;
    private String nextStep;
    private BigDecimal estimatedAmount;
    private BigDecimal estimatedProbability;
    private String currencyUomId;
    private LocalDateTime estimatedCloseDate;
    private String opportunityStageId;
    private String changeNote;
    private String modifiedByUserLogin;
    private LocalDateTime modifiedTimestamp;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setSalesOpportunityHistoryId(String salesOpportunityHistoryId) {
        this.salesOpportunityHistoryId = salesOpportunityHistoryId;
    }
public void setSalesOpportunityId(String salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }
public void setEstimatedAmount(BigDecimal estimatedAmount) {
        this.estimatedAmount = estimatedAmount;
    }
public void setEstimatedProbability(BigDecimal estimatedProbability) {
        this.estimatedProbability = estimatedProbability;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setEstimatedCloseDate(LocalDateTime estimatedCloseDate) {
        this.estimatedCloseDate = estimatedCloseDate;
    }
public void setOpportunityStageId(String opportunityStageId) {
        this.opportunityStageId = opportunityStageId;
    }
public void setChangeNote(String changeNote) {
        this.changeNote = changeNote;
    }
public void setModifiedByUserLogin(String modifiedByUserLogin) {
        this.modifiedByUserLogin = modifiedByUserLogin;
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
