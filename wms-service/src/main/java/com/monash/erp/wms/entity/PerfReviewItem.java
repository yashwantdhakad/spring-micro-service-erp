package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class PerfReviewItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String employeePartyId;
    private String employeeRoleTypeId;
    private String perfReviewId;
    private String perfReviewItemSeqId;
    private String perfRatingTypeId;
    private String perfReviewItemTypeId;
    private String comments;
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

    public String getEmployeePartyId() {
        return employeePartyId;
    }

    public void setEmployeePartyId(String employeePartyId) {
        this.employeePartyId = employeePartyId;
    }

    public String getEmployeeRoleTypeId() {
        return employeeRoleTypeId;
    }

    public void setEmployeeRoleTypeId(String employeeRoleTypeId) {
        this.employeeRoleTypeId = employeeRoleTypeId;
    }

    public String getPerfReviewId() {
        return perfReviewId;
    }

    public void setPerfReviewId(String perfReviewId) {
        this.perfReviewId = perfReviewId;
    }

    public String getPerfReviewItemSeqId() {
        return perfReviewItemSeqId;
    }

    public void setPerfReviewItemSeqId(String perfReviewItemSeqId) {
        this.perfReviewItemSeqId = perfReviewItemSeqId;
    }

    public String getPerfRatingTypeId() {
        return perfRatingTypeId;
    }

    public void setPerfRatingTypeId(String perfRatingTypeId) {
        this.perfRatingTypeId = perfRatingTypeId;
    }

    public String getPerfReviewItemTypeId() {
        return perfReviewItemTypeId;
    }

    public void setPerfReviewItemTypeId(String perfReviewItemTypeId) {
        this.perfReviewItemTypeId = perfReviewItemTypeId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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