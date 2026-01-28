package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class AbleTrace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String traceId;
    private String inventoryItemId;
    private String cageCodeId;
    private String uniqueId;
    private String productId;
    private LocalDateTime timeStamp;
    private String actionCode;
    private String conditionCode;
    private String oemPartyId;
    private String oemSerialNumber;
    private String shpPartyId;
    private String insJobNumber;
    private String rmvJobNumber;
    private String newLimits;
    private String excCageCode;
    private String excSerialNumber;
    private String excPartNumber;
    private String excPartyCageCode;
    private String sldPartyId;
    private String buyPartyId;
    private String desMethod;
    private String rcdPartyId;
    private String upgDescription;
    private String inpComments;
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

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getCageCodeId() {
        return cageCodeId;
    }

    public void setCageCodeId(String cageCodeId) {
        this.cageCodeId = cageCodeId;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public String getConditionCode() {
        return conditionCode;
    }

    public void setConditionCode(String conditionCode) {
        this.conditionCode = conditionCode;
    }

    public String getOemPartyId() {
        return oemPartyId;
    }

    public void setOemPartyId(String oemPartyId) {
        this.oemPartyId = oemPartyId;
    }

    public String getOemSerialNumber() {
        return oemSerialNumber;
    }

    public void setOemSerialNumber(String oemSerialNumber) {
        this.oemSerialNumber = oemSerialNumber;
    }

    public String getShpPartyId() {
        return shpPartyId;
    }

    public void setShpPartyId(String shpPartyId) {
        this.shpPartyId = shpPartyId;
    }

    public String getInsJobNumber() {
        return insJobNumber;
    }

    public void setInsJobNumber(String insJobNumber) {
        this.insJobNumber = insJobNumber;
    }

    public String getRmvJobNumber() {
        return rmvJobNumber;
    }

    public void setRmvJobNumber(String rmvJobNumber) {
        this.rmvJobNumber = rmvJobNumber;
    }

    public String getNewLimits() {
        return newLimits;
    }

    public void setNewLimits(String newLimits) {
        this.newLimits = newLimits;
    }

    public String getExcCageCode() {
        return excCageCode;
    }

    public void setExcCageCode(String excCageCode) {
        this.excCageCode = excCageCode;
    }

    public String getExcSerialNumber() {
        return excSerialNumber;
    }

    public void setExcSerialNumber(String excSerialNumber) {
        this.excSerialNumber = excSerialNumber;
    }

    public String getExcPartNumber() {
        return excPartNumber;
    }

    public void setExcPartNumber(String excPartNumber) {
        this.excPartNumber = excPartNumber;
    }

    public String getExcPartyCageCode() {
        return excPartyCageCode;
    }

    public void setExcPartyCageCode(String excPartyCageCode) {
        this.excPartyCageCode = excPartyCageCode;
    }

    public String getSldPartyId() {
        return sldPartyId;
    }

    public void setSldPartyId(String sldPartyId) {
        this.sldPartyId = sldPartyId;
    }

    public String getBuyPartyId() {
        return buyPartyId;
    }

    public void setBuyPartyId(String buyPartyId) {
        this.buyPartyId = buyPartyId;
    }

    public String getDesMethod() {
        return desMethod;
    }

    public void setDesMethod(String desMethod) {
        this.desMethod = desMethod;
    }

    public String getRcdPartyId() {
        return rcdPartyId;
    }

    public void setRcdPartyId(String rcdPartyId) {
        this.rcdPartyId = rcdPartyId;
    }

    public String getUpgDescription() {
        return upgDescription;
    }

    public void setUpgDescription(String upgDescription) {
        this.upgDescription = upgDescription;
    }

    public String getInpComments() {
        return inpComments;
    }

    public void setInpComments(String inpComments) {
        this.inpComments = inpComments;
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