package com.monash.erp.mfg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
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

    public String getWorkEffortTypeId() {
        return workEffortTypeId;
    }

    public void setWorkEffortTypeId(String workEffortTypeId) {
        this.workEffortTypeId = workEffortTypeId;
    }

    public String getCurrentStatusId() {
        return currentStatusId;
    }

    public void setCurrentStatusId(String currentStatusId) {
        this.currentStatusId = currentStatusId;
    }

    public LocalDateTime getLastStatusUpdate() {
        return lastStatusUpdate;
    }

    public void setLastStatusUpdate(LocalDateTime lastStatusUpdate) {
        this.lastStatusUpdate = lastStatusUpdate;
    }

    public String getWorkEffortPurposeTypeId() {
        return workEffortPurposeTypeId;
    }

    public void setWorkEffortPurposeTypeId(String workEffortPurposeTypeId) {
        this.workEffortPurposeTypeId = workEffortPurposeTypeId;
    }

    public String getWorkEffortParentId() {
        return workEffortParentId;
    }

    public void setWorkEffortParentId(String workEffortParentId) {
        this.workEffortParentId = workEffortParentId;
    }

    public String getScopeEnumId() {
        return scopeEnumId;
    }

    public void setScopeEnumId(String scopeEnumId) {
        this.scopeEnumId = scopeEnumId;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(String percentComplete) {
        this.percentComplete = percentComplete;
    }

    public String getWorkEffortName() {
        return workEffortName;
    }

    public void setWorkEffortName(String workEffortName) {
        this.workEffortName = workEffortName;
    }

    public String getShowAsEnumId() {
        return showAsEnumId;
    }

    public void setShowAsEnumId(String showAsEnumId) {
        this.showAsEnumId = showAsEnumId;
    }

    public String getSendNotificationEmail() {
        return sendNotificationEmail;
    }

    public void setSendNotificationEmail(String sendNotificationEmail) {
        this.sendNotificationEmail = sendNotificationEmail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocationDesc() {
        return locationDesc;
    }

    public void setLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
    }

    public LocalDateTime getEstimatedStartDate() {
        return estimatedStartDate;
    }

    public void setEstimatedStartDate(LocalDateTime estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }

    public LocalDateTime getEstimatedCompletionDate() {
        return estimatedCompletionDate;
    }

    public void setEstimatedCompletionDate(LocalDateTime estimatedCompletionDate) {
        this.estimatedCompletionDate = estimatedCompletionDate;
    }

    public LocalDateTime getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(LocalDateTime actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public LocalDateTime getActualCompletionDate() {
        return actualCompletionDate;
    }

    public void setActualCompletionDate(LocalDateTime actualCompletionDate) {
        this.actualCompletionDate = actualCompletionDate;
    }

    public String getEstimatedMilliSeconds() {
        return estimatedMilliSeconds;
    }

    public void setEstimatedMilliSeconds(String estimatedMilliSeconds) {
        this.estimatedMilliSeconds = estimatedMilliSeconds;
    }

    public String getEstimatedSetupMillis() {
        return estimatedSetupMillis;
    }

    public void setEstimatedSetupMillis(String estimatedSetupMillis) {
        this.estimatedSetupMillis = estimatedSetupMillis;
    }

    public String getEstimateCalcMethod() {
        return estimateCalcMethod;
    }

    public void setEstimateCalcMethod(String estimateCalcMethod) {
        this.estimateCalcMethod = estimateCalcMethod;
    }

    public String getActualMilliSeconds() {
        return actualMilliSeconds;
    }

    public void setActualMilliSeconds(String actualMilliSeconds) {
        this.actualMilliSeconds = actualMilliSeconds;
    }

    public String getActualSetupMillis() {
        return actualSetupMillis;
    }

    public void setActualSetupMillis(String actualSetupMillis) {
        this.actualSetupMillis = actualSetupMillis;
    }

    public String getTotalMilliSecondsAllowed() {
        return totalMilliSecondsAllowed;
    }

    public void setTotalMilliSecondsAllowed(String totalMilliSecondsAllowed) {
        this.totalMilliSecondsAllowed = totalMilliSecondsAllowed;
    }

    public String getTotalMoneyAllowed() {
        return totalMoneyAllowed;
    }

    public void setTotalMoneyAllowed(String totalMoneyAllowed) {
        this.totalMoneyAllowed = totalMoneyAllowed;
    }

    public String getMoneyUomId() {
        return moneyUomId;
    }

    public void setMoneyUomId(String moneyUomId) {
        this.moneyUomId = moneyUomId;
    }

    public String getSpecialTerms() {
        return specialTerms;
    }

    public void setSpecialTerms(String specialTerms) {
        this.specialTerms = specialTerms;
    }

    public String getTimeTransparency() {
        return timeTransparency;
    }

    public void setTimeTransparency(String timeTransparency) {
        this.timeTransparency = timeTransparency;
    }

    public String getUniversalId() {
        return universalId;
    }

    public void setUniversalId(String universalId) {
        this.universalId = universalId;
    }

    public String getSourceReferenceId() {
        return sourceReferenceId;
    }

    public void setSourceReferenceId(String sourceReferenceId) {
        this.sourceReferenceId = sourceReferenceId;
    }

    public String getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getInfoUrl() {
        return infoUrl;
    }

    public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
    }

    public String getRecurrenceInfoId() {
        return recurrenceInfoId;
    }

    public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }

    public String getTempExprId() {
        return tempExprId;
    }

    public void setTempExprId(String tempExprId) {
        this.tempExprId = tempExprId;
    }

    public String getRuntimeDataId() {
        return runtimeDataId;
    }

    public void setRuntimeDataId(String runtimeDataId) {
        this.runtimeDataId = runtimeDataId;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getServiceLoaderName() {
        return serviceLoaderName;
    }

    public void setServiceLoaderName(String serviceLoaderName) {
        this.serviceLoaderName = serviceLoaderName;
    }

    public String getQuantityToProduce() {
        return quantityToProduce;
    }

    public void setQuantityToProduce(String quantityToProduce) {
        this.quantityToProduce = quantityToProduce;
    }

    public String getQuantityProduced() {
        return quantityProduced;
    }

    public void setQuantityProduced(String quantityProduced) {
        this.quantityProduced = quantityProduced;
    }

    public String getQuantityRejected() {
        return quantityRejected;
    }

    public void setQuantityRejected(String quantityRejected) {
        this.quantityRejected = quantityRejected;
    }

    public String getReservPersons() {
        return reservPersons;
    }

    public void setReservPersons(String reservPersons) {
        this.reservPersons = reservPersons;
    }

    public String getReserv2ndPPPerc() {
        return reserv2ndPPPerc;
    }

    public void setReserv2ndPPPerc(String reserv2ndPPPerc) {
        this.reserv2ndPPPerc = reserv2ndPPPerc;
    }

    public String getReservNthPPPerc() {
        return reservNthPPPerc;
    }

    public void setReservNthPPPerc(String reservNthPPPerc) {
        this.reservNthPPPerc = reservNthPPPerc;
    }

    public String getAccommodationMapId() {
        return accommodationMapId;
    }

    public void setAccommodationMapId(String accommodationMapId) {
        this.accommodationMapId = accommodationMapId;
    }

    public String getAccommodationSpotId() {
        return accommodationSpotId;
    }

    public void setAccommodationSpotId(String accommodationSpotId) {
        this.accommodationSpotId = accommodationSpotId;
    }

    public String getRevisionNumber() {
        return revisionNumber;
    }

    public void setRevisionNumber(String revisionNumber) {
        this.revisionNumber = revisionNumber;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

}