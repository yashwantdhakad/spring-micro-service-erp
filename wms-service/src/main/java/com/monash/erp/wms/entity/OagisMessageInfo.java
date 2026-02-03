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
public void setId(Long id) {
        this.id = id;
    }
public void setLogicalId(String logicalId) {
        this.logicalId = logicalId;
    }
public void setComponent(String component) {
        this.component = component;
    }
public void setTask(String task) {
        this.task = task;
    }
public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }
public void setAuthId(String authId) {
        this.authId = authId;
    }
public void setOutgoingMessage(String outgoingMessage) {
        this.outgoingMessage = outgoingMessage;
    }
public void setSentDate(LocalDateTime sentDate) {
        this.sentDate = sentDate;
    }
public void setReceivedDate(LocalDateTime receivedDate) {
        this.receivedDate = receivedDate;
    }
public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }
public void setBsrVerb(String bsrVerb) {
        this.bsrVerb = bsrVerb;
    }
public void setBsrNoun(String bsrNoun) {
        this.bsrNoun = bsrNoun;
    }
public void setBsrRevision(String bsrRevision) {
        this.bsrRevision = bsrRevision;
    }
public void setProcessingStatusId(String processingStatusId) {
        this.processingStatusId = processingStatusId;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setReturnId(String returnId) {
        this.returnId = returnId;
    }
public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
public void setOrigRef(String origRef) {
        this.origRef = origRef;
    }
public void setFullMessageXml(String fullMessageXml) {
        this.fullMessageXml = fullMessageXml;
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
