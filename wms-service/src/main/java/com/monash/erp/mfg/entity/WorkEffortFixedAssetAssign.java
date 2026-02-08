package com.monash.erp.mfg.entity;

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
public class WorkEffortFixedAssetAssign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workEffortId;
    private String fixedAssetId;
    private String statusId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String availabilityStatusId;
    private String allocatedCost;
    private String comments;
public void setId(Long id) {
        this.id = id;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setAvailabilityStatusId(String availabilityStatusId) {
        this.availabilityStatusId = availabilityStatusId;
    }
public void setAllocatedCost(String allocatedCost) {
        this.allocatedCost = allocatedCost;
    }
public void setComments(String comments) {
        this.comments = comments;
    }

}
