package com.monash.erp.mfg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class WorkEffortPartyAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workEffortId;
    private String partyId;
    private String roleTypeId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String assignedByUserLoginId;
    private String statusId;
    private LocalDateTime statusDateTime;
    private String expectationEnumId;
    private String delegateReasonEnumId;
    private String facilityId;
    private String comments;
    private String mustRsvp;
    private String availabilityStatusId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
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

    public String getAssignedByUserLoginId() {
        return assignedByUserLoginId;
    }

    public void setAssignedByUserLoginId(String assignedByUserLoginId) {
        this.assignedByUserLoginId = assignedByUserLoginId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public LocalDateTime getStatusDateTime() {
        return statusDateTime;
    }

    public void setStatusDateTime(LocalDateTime statusDateTime) {
        this.statusDateTime = statusDateTime;
    }

    public String getExpectationEnumId() {
        return expectationEnumId;
    }

    public void setExpectationEnumId(String expectationEnumId) {
        this.expectationEnumId = expectationEnumId;
    }

    public String getDelegateReasonEnumId() {
        return delegateReasonEnumId;
    }

    public void setDelegateReasonEnumId(String delegateReasonEnumId) {
        this.delegateReasonEnumId = delegateReasonEnumId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getMustRsvp() {
        return mustRsvp;
    }

    public void setMustRsvp(String mustRsvp) {
        this.mustRsvp = mustRsvp;
    }

    public String getAvailabilityStatusId() {
        return availabilityStatusId;
    }

    public void setAvailabilityStatusId(String availabilityStatusId) {
        this.availabilityStatusId = availabilityStatusId;
    }

}