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
public class ContentSearchResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentSearchResultId;
    private String visitId;
    private String orderByName;
    private String isAscending;
    private String numResults;
    private String secondsTotal;
    private LocalDateTime searchDate;
public void setId(Long id) {
        this.id = id;
    }
public void setContentSearchResultId(String contentSearchResultId) {
        this.contentSearchResultId = contentSearchResultId;
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
public void setNumResults(String numResults) {
        this.numResults = numResults;
    }
public void setSecondsTotal(String secondsTotal) {
        this.secondsTotal = secondsTotal;
    }
public void setSearchDate(LocalDateTime searchDate) {
        this.searchDate = searchDate;
    }

}
