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
public class PerfReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String employeePartyId;
    private String employeeRoleTypeId;
    private String perfReviewId;
    private String managerPartyId;
    private String managerRoleTypeId;
    private String paymentId;
    private String emplPositionId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
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
public void setManagerPartyId(String managerPartyId) {
        this.managerPartyId = managerPartyId;
    }
public void setManagerRoleTypeId(String managerRoleTypeId) {
        this.managerRoleTypeId = managerRoleTypeId;
    }
public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
public void setEmplPositionId(String emplPositionId) {
        this.emplPositionId = emplPositionId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
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
