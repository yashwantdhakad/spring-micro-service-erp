package com.monash.erp.mfg.entity;

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
public class WorkEffortSearchResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workEffortSearchResultId;
    private String visitId;
    private String orderByName;
    private String isAscending;
    private BigDecimal numResults;
    private BigDecimal secondsTotal;
    private LocalDateTime searchDate;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setWorkEffortSearchResultId(String workEffortSearchResultId) {
        this.workEffortSearchResultId = workEffortSearchResultId;
    }
public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
public void setOrderByName(String orderByName) {
        this.orderByName = orderByName;
    }
public void setIsAscending(String isAscending) {
        this.isAscending = isAscending;
    }
public void setNumResults(BigDecimal numResults) {
        this.numResults = numResults;
    }
public void setSecondsTotal(BigDecimal secondsTotal) {
        this.secondsTotal = secondsTotal;
    }
public void setSearchDate(LocalDateTime searchDate) {
        this.searchDate = searchDate;
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
