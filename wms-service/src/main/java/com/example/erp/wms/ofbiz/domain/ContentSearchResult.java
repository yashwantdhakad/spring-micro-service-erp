package com.example.erp.wms.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContentSearchResultId() {
        return contentSearchResultId;
    }

    public void setContentSearchResultId(String contentSearchResultId) {
        this.contentSearchResultId = contentSearchResultId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getOrderByName() {
        return orderByName;
    }

    public void setOrderByName(String orderByName) {
        this.orderByName = orderByName;
    }

    public String getIsAscending() {
        return isAscending;
    }

    public void setIsAscending(String isAscending) {
        this.isAscending = isAscending;
    }

    public String getNumResults() {
        return numResults;
    }

    public void setNumResults(String numResults) {
        this.numResults = numResults;
    }

    public String getSecondsTotal() {
        return secondsTotal;
    }

    public void setSecondsTotal(String secondsTotal) {
        this.secondsTotal = secondsTotal;
    }

    public LocalDateTime getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(LocalDateTime searchDate) {
        this.searchDate = searchDate;
    }

}