package com.monash.erp.mfg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class WorkEffortInvReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workEffortId;
    private String inventoryItemId;
    private String reserveOrderEnumId;
    private BigDecimal quantity;
    private BigDecimal quantityNotAvailable;
    private LocalDateTime reservedDatetime;
    private LocalDateTime createdDatetime;
    private LocalDateTime promisedDatetime;
    private LocalDateTime currentPromisedDate;
    private BigDecimal sequenceId;
    private String wegsReferenceNumber;
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

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getReserveOrderEnumId() {
        return reserveOrderEnumId;
    }

    public void setReserveOrderEnumId(String reserveOrderEnumId) {
        this.reserveOrderEnumId = reserveOrderEnumId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getQuantityNotAvailable() {
        return quantityNotAvailable;
    }

    public void setQuantityNotAvailable(BigDecimal quantityNotAvailable) {
        this.quantityNotAvailable = quantityNotAvailable;
    }

    public LocalDateTime getReservedDatetime() {
        return reservedDatetime;
    }

    public void setReservedDatetime(LocalDateTime reservedDatetime) {
        this.reservedDatetime = reservedDatetime;
    }

    public LocalDateTime getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(LocalDateTime createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public LocalDateTime getPromisedDatetime() {
        return promisedDatetime;
    }

    public void setPromisedDatetime(LocalDateTime promisedDatetime) {
        this.promisedDatetime = promisedDatetime;
    }

    public LocalDateTime getCurrentPromisedDate() {
        return currentPromisedDate;
    }

    public void setCurrentPromisedDate(LocalDateTime currentPromisedDate) {
        this.currentPromisedDate = currentPromisedDate;
    }

    public BigDecimal getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(BigDecimal sequenceId) {
        this.sequenceId = sequenceId;
    }

    public String getWegsReferenceNumber() {
        return wegsReferenceNumber;
    }

    public void setWegsReferenceNumber(String wegsReferenceNumber) {
        this.wegsReferenceNumber = wegsReferenceNumber;
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