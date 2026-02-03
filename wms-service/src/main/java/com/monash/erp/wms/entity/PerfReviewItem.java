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
public void setId(Long id) {
        this.id = id;
    }
public void setEmployeePartyId(String employeePartyId) {
        this.employeePartyId = employeePartyId;
    }
public void setEmployeeRoleTypeId(String employeeRoleTypeId) {
        this.employeeRoleTypeId = employeeRoleTypeId;
    }
public void setPerfReviewId(String perfReviewId) {
        this.perfReviewId = perfReviewId;
    }
public void setPerfReviewItemSeqId(String perfReviewItemSeqId) {
        this.perfReviewItemSeqId = perfReviewItemSeqId;
    }
public void setPerfRatingTypeId(String perfRatingTypeId) {
        this.perfRatingTypeId = perfRatingTypeId;
    }
public void setPerfReviewItemTypeId(String perfReviewItemTypeId) {
        this.perfReviewItemTypeId = perfReviewItemTypeId;
    }
public void setComments(String comments) {
        this.comments = comments;
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
