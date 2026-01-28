package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class PosTerminalState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String posTerminalId;
    private LocalDateTime openedDate;
    private LocalDateTime closedDate;
    private String startingTxId;
    private String endingTxId;
    private String openedByUserLoginId;
    private String closedByUserLoginId;
    private BigDecimal startingDrawerAmount;
    private BigDecimal actualEndingCash;
    private BigDecimal actualEndingCheck;
    private BigDecimal actualEndingCc;
    private BigDecimal actualEndingGc;
    private BigDecimal actualEndingOther;
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

    public String getPosTerminalId() {
        return posTerminalId;
    }

    public void setPosTerminalId(String posTerminalId) {
        this.posTerminalId = posTerminalId;
    }

    public LocalDateTime getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(LocalDateTime openedDate) {
        this.openedDate = openedDate;
    }

    public LocalDateTime getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(LocalDateTime closedDate) {
        this.closedDate = closedDate;
    }

    public String getStartingTxId() {
        return startingTxId;
    }

    public void setStartingTxId(String startingTxId) {
        this.startingTxId = startingTxId;
    }

    public String getEndingTxId() {
        return endingTxId;
    }

    public void setEndingTxId(String endingTxId) {
        this.endingTxId = endingTxId;
    }

    public String getOpenedByUserLoginId() {
        return openedByUserLoginId;
    }

    public void setOpenedByUserLoginId(String openedByUserLoginId) {
        this.openedByUserLoginId = openedByUserLoginId;
    }

    public String getClosedByUserLoginId() {
        return closedByUserLoginId;
    }

    public void setClosedByUserLoginId(String closedByUserLoginId) {
        this.closedByUserLoginId = closedByUserLoginId;
    }

    public BigDecimal getStartingDrawerAmount() {
        return startingDrawerAmount;
    }

    public void setStartingDrawerAmount(BigDecimal startingDrawerAmount) {
        this.startingDrawerAmount = startingDrawerAmount;
    }

    public BigDecimal getActualEndingCash() {
        return actualEndingCash;
    }

    public void setActualEndingCash(BigDecimal actualEndingCash) {
        this.actualEndingCash = actualEndingCash;
    }

    public BigDecimal getActualEndingCheck() {
        return actualEndingCheck;
    }

    public void setActualEndingCheck(BigDecimal actualEndingCheck) {
        this.actualEndingCheck = actualEndingCheck;
    }

    public BigDecimal getActualEndingCc() {
        return actualEndingCc;
    }

    public void setActualEndingCc(BigDecimal actualEndingCc) {
        this.actualEndingCc = actualEndingCc;
    }

    public BigDecimal getActualEndingGc() {
        return actualEndingGc;
    }

    public void setActualEndingGc(BigDecimal actualEndingGc) {
        this.actualEndingGc = actualEndingGc;
    }

    public BigDecimal getActualEndingOther() {
        return actualEndingOther;
    }

    public void setActualEndingOther(BigDecimal actualEndingOther) {
        this.actualEndingOther = actualEndingOther;
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