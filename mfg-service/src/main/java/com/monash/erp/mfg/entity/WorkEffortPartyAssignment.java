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
public void setId(Long id) {
        this.id = id;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setAssignedByUserLoginId(String assignedByUserLoginId) {
        this.assignedByUserLoginId = assignedByUserLoginId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setStatusDateTime(LocalDateTime statusDateTime) {
        this.statusDateTime = statusDateTime;
    }
public void setExpectationEnumId(String expectationEnumId) {
        this.expectationEnumId = expectationEnumId;
    }
public void setDelegateReasonEnumId(String delegateReasonEnumId) {
        this.delegateReasonEnumId = delegateReasonEnumId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setMustRsvp(String mustRsvp) {
        this.mustRsvp = mustRsvp;
    }
public void setAvailabilityStatusId(String availabilityStatusId) {
        this.availabilityStatusId = availabilityStatusId;
    }

}
