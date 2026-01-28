package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class OagisMessageInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logicalId;
    private String component;
    private String task;
    private String referenceId;
    private String authId;
    private String outgoingMessage;
    private LocalDateTime sentDate;
    private LocalDateTime receivedDate;
    private String confirmation;
    private String bsrVerb;
    private String bsrNoun;
    private String bsrRevision;
    private String processingStatusId;
    private String orderId;
    private String returnId;
    private String shipmentId;
    private String origRef;
    private String fullMessageXml;
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

    public String getLogicalId() {
        return logicalId;
    }

    public void setLogicalId(String logicalId) {
        this.logicalId = logicalId;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public String getOutgoingMessage() {
        return outgoingMessage;
    }

    public void setOutgoingMessage(String outgoingMessage) {
        this.outgoingMessage = outgoingMessage;
    }

    public LocalDateTime getSentDate() {
        return sentDate;
    }

    public void setSentDate(LocalDateTime sentDate) {
        this.sentDate = sentDate;
    }

    public LocalDateTime getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDateTime receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    public String getBsrVerb() {
        return bsrVerb;
    }

    public void setBsrVerb(String bsrVerb) {
        this.bsrVerb = bsrVerb;
    }

    public String getBsrNoun() {
        return bsrNoun;
    }

    public void setBsrNoun(String bsrNoun) {
        this.bsrNoun = bsrNoun;
    }

    public String getBsrRevision() {
        return bsrRevision;
    }

    public void setBsrRevision(String bsrRevision) {
        this.bsrRevision = bsrRevision;
    }

    public String getProcessingStatusId() {
        return processingStatusId;
    }

    public void setProcessingStatusId(String processingStatusId) {
        this.processingStatusId = processingStatusId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getOrigRef() {
        return origRef;
    }

    public void setOrigRef(String origRef) {
        this.origRef = origRef;
    }

    public String getFullMessageXml() {
        return fullMessageXml;
    }

    public void setFullMessageXml(String fullMessageXml) {
        this.fullMessageXml = fullMessageXml;
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