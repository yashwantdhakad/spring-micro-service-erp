package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Able015 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemSeqId;
    private String verifyDocumentation;
    private String verifyPartConforms;
    private String verifyMaintenancePerformed;
    private String qaOverridePartyId;
    private LocalDateTime qaOverrideDate;
    private String qaNotes;
    private String notes;
    private String inspectorPartyId;
    private LocalDateTime inspectedDate;
    private String inspectorPartyIdS2;
    private LocalDateTime inspectedDateS2;
    private String notesS2;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String receiptId;
    private String inventoryItemId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getVerifyDocumentation() {
        return verifyDocumentation;
    }

    public void setVerifyDocumentation(String verifyDocumentation) {
        this.verifyDocumentation = verifyDocumentation;
    }

    public String getVerifyPartConforms() {
        return verifyPartConforms;
    }

    public void setVerifyPartConforms(String verifyPartConforms) {
        this.verifyPartConforms = verifyPartConforms;
    }

    public String getVerifyMaintenancePerformed() {
        return verifyMaintenancePerformed;
    }

    public void setVerifyMaintenancePerformed(String verifyMaintenancePerformed) {
        this.verifyMaintenancePerformed = verifyMaintenancePerformed;
    }

    public String getQaOverridePartyId() {
        return qaOverridePartyId;
    }

    public void setQaOverridePartyId(String qaOverridePartyId) {
        this.qaOverridePartyId = qaOverridePartyId;
    }

    public LocalDateTime getQaOverrideDate() {
        return qaOverrideDate;
    }

    public void setQaOverrideDate(LocalDateTime qaOverrideDate) {
        this.qaOverrideDate = qaOverrideDate;
    }

    public String getQaNotes() {
        return qaNotes;
    }

    public void setQaNotes(String qaNotes) {
        this.qaNotes = qaNotes;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getInspectorPartyId() {
        return inspectorPartyId;
    }

    public void setInspectorPartyId(String inspectorPartyId) {
        this.inspectorPartyId = inspectorPartyId;
    }

    public LocalDateTime getInspectedDate() {
        return inspectedDate;
    }

    public void setInspectedDate(LocalDateTime inspectedDate) {
        this.inspectedDate = inspectedDate;
    }

    public String getInspectorPartyIdS2() {
        return inspectorPartyIdS2;
    }

    public void setInspectorPartyIdS2(String inspectorPartyIdS2) {
        this.inspectorPartyIdS2 = inspectorPartyIdS2;
    }

    public LocalDateTime getInspectedDateS2() {
        return inspectedDateS2;
    }

    public void setInspectedDateS2(LocalDateTime inspectedDateS2) {
        this.inspectedDateS2 = inspectedDateS2;
    }

    public String getNotesS2() {
        return notesS2;
    }

    public void setNotesS2(String notesS2) {
        this.notesS2 = notesS2;
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

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

}