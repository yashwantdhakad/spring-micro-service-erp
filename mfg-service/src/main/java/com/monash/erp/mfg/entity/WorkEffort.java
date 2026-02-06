package com.monash.erp.mfg.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "work_effort",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_work_effort_work_effort_id", columnNames = "work_effort_id")
        },
        indexes = {
                @Index(name = "idx_work_effort_work_effort_id", columnList = "work_effort_id"),
                @Index(name = "idx_work_effort_parent_id", columnList = "work_effort_parent_id"),
                @Index(name = "idx_work_effort_purpose_type_id", columnList = "work_effort_purpose_type_id"),
                @Index(name = "idx_work_effort_type_id", columnList = "work_effort_type_id"),
                @Index(name = "idx_work_effort_name", columnList = "work_effort_name"),
                @Index(name = "idx_work_effort_facility_id", columnList = "facility_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class WorkEffort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workEffortId;
    private String workEffortTypeId;
    private String currentStatusId;
    private LocalDateTime lastStatusUpdate;
    private String workEffortPurposeTypeId;
    private String workEffortParentId;
    private String scopeEnumId;
    private String priority;
    private String percentComplete;
    private String workEffortName;
    private String showAsEnumId;
    private String sendNotificationEmail;
    private String description;
    private String locationDesc;
    private LocalDateTime estimatedStartDate;
    private LocalDateTime estimatedCompletionDate;
    private LocalDateTime actualStartDate;
    private LocalDateTime actualCompletionDate;
    private String estimatedMilliSeconds;
    private String estimatedSetupMillis;
    private String estimateCalcMethod;
    private String actualMilliSeconds;
    private String actualSetupMillis;
    private String totalMilliSecondsAllowed;
    private String totalMoneyAllowed;
    private String moneyUomId;
    private String specialTerms;
    private String timeTransparency;
    private String universalId;
    private String sourceReferenceId;
    private String fixedAssetId;
    private String facilityId;
    private String infoUrl;
    private String recurrenceInfoId;
    private String tempExprId;
    private String runtimeDataId;
    private String noteId;
    private String serviceLoaderName;
    private String quantityToProduce;
    private String quantityProduced;
    private String quantityRejected;
    private String reservPersons;
    private String reserv2ndPPPerc;
    private String reservNthPPPerc;
    private String accommodationMapId;
    private String accommodationSpotId;
    private String revisionNumber;
    private LocalDateTime createdDate;
    private String createdByUserLogin;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedByUserLogin;
public void setId(Long id) {
        this.id = id;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setWorkEffortTypeId(String workEffortTypeId) {
        this.workEffortTypeId = workEffortTypeId;
    }
public void setCurrentStatusId(String currentStatusId) {
        this.currentStatusId = currentStatusId;
    }
public void setLastStatusUpdate(LocalDateTime lastStatusUpdate) {
        this.lastStatusUpdate = lastStatusUpdate;
    }
public void setWorkEffortPurposeTypeId(String workEffortPurposeTypeId) {
        this.workEffortPurposeTypeId = workEffortPurposeTypeId;
    }
public void setWorkEffortParentId(String workEffortParentId) {
        this.workEffortParentId = workEffortParentId;
    }
public void setScopeEnumId(String scopeEnumId) {
        this.scopeEnumId = scopeEnumId;
    }
public void setPriority(String priority) {
        this.priority = priority;
    }
public void setPercentComplete(String percentComplete) {
        this.percentComplete = percentComplete;
    }
public void setWorkEffortName(String workEffortName) {
        this.workEffortName = workEffortName;
    }
public void setShowAsEnumId(String showAsEnumId) {
        this.showAsEnumId = showAsEnumId;
    }
public void setSendNotificationEmail(String sendNotificationEmail) {
        this.sendNotificationEmail = sendNotificationEmail;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
    }
public void setEstimatedStartDate(LocalDateTime estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }
public void setEstimatedCompletionDate(LocalDateTime estimatedCompletionDate) {
        this.estimatedCompletionDate = estimatedCompletionDate;
    }
public void setActualStartDate(LocalDateTime actualStartDate) {
        this.actualStartDate = actualStartDate;
    }
public void setActualCompletionDate(LocalDateTime actualCompletionDate) {
        this.actualCompletionDate = actualCompletionDate;
    }
public void setEstimatedMilliSeconds(String estimatedMilliSeconds) {
        this.estimatedMilliSeconds = estimatedMilliSeconds;
    }
public void setEstimatedSetupMillis(String estimatedSetupMillis) {
        this.estimatedSetupMillis = estimatedSetupMillis;
    }
public void setEstimateCalcMethod(String estimateCalcMethod) {
        this.estimateCalcMethod = estimateCalcMethod;
    }
public void setActualMilliSeconds(String actualMilliSeconds) {
        this.actualMilliSeconds = actualMilliSeconds;
    }
public void setActualSetupMillis(String actualSetupMillis) {
        this.actualSetupMillis = actualSetupMillis;
    }
public void setTotalMilliSecondsAllowed(String totalMilliSecondsAllowed) {
        this.totalMilliSecondsAllowed = totalMilliSecondsAllowed;
    }
public void setTotalMoneyAllowed(String totalMoneyAllowed) {
        this.totalMoneyAllowed = totalMoneyAllowed;
    }
public void setMoneyUomId(String moneyUomId) {
        this.moneyUomId = moneyUomId;
    }
public void setSpecialTerms(String specialTerms) {
        this.specialTerms = specialTerms;
    }
public void setTimeTransparency(String timeTransparency) {
        this.timeTransparency = timeTransparency;
    }
public void setUniversalId(String universalId) {
        this.universalId = universalId;
    }
public void setSourceReferenceId(String sourceReferenceId) {
        this.sourceReferenceId = sourceReferenceId;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
    }
public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }
public void setTempExprId(String tempExprId) {
        this.tempExprId = tempExprId;
    }
public void setRuntimeDataId(String runtimeDataId) {
        this.runtimeDataId = runtimeDataId;
    }
public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
public void setServiceLoaderName(String serviceLoaderName) {
        this.serviceLoaderName = serviceLoaderName;
    }
public void setQuantityToProduce(String quantityToProduce) {
        this.quantityToProduce = quantityToProduce;
    }
public void setQuantityProduced(String quantityProduced) {
        this.quantityProduced = quantityProduced;
    }
public void setQuantityRejected(String quantityRejected) {
        this.quantityRejected = quantityRejected;
    }
public void setReservPersons(String reservPersons) {
        this.reservPersons = reservPersons;
    }
public void setReserv2ndPPPerc(String reserv2ndPPPerc) {
        this.reserv2ndPPPerc = reserv2ndPPPerc;
    }
public void setReservNthPPPerc(String reservNthPPPerc) {
        this.reservNthPPPerc = reservNthPPPerc;
    }
public void setAccommodationMapId(String accommodationMapId) {
        this.accommodationMapId = accommodationMapId;
    }
public void setAccommodationSpotId(String accommodationSpotId) {
        this.accommodationSpotId = accommodationSpotId;
    }
public void setRevisionNumber(String revisionNumber) {
        this.revisionNumber = revisionNumber;
    }
public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

}
