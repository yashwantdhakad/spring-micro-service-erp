package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
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

    public String getManagerPartyId() {
        return managerPartyId;
    }

    public void setManagerPartyId(String managerPartyId) {
        this.managerPartyId = managerPartyId;
    }

    public String getManagerRoleTypeId() {
        return managerRoleTypeId;
    }

    public void setManagerRoleTypeId(String managerRoleTypeId) {
        this.managerRoleTypeId = managerRoleTypeId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getEmplPositionId() {
        return emplPositionId;
    }

    public void setEmplPositionId(String emplPositionId) {
        this.emplPositionId = emplPositionId;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
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