package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setPosTerminalId(String posTerminalId) {
        this.posTerminalId = posTerminalId;
    }
public void setOpenedDate(LocalDateTime openedDate) {
        this.openedDate = openedDate;
    }
public void setClosedDate(LocalDateTime closedDate) {
        this.closedDate = closedDate;
    }
public void setStartingTxId(String startingTxId) {
        this.startingTxId = startingTxId;
    }
public void setEndingTxId(String endingTxId) {
        this.endingTxId = endingTxId;
    }
public void setOpenedByUserLoginId(String openedByUserLoginId) {
        this.openedByUserLoginId = openedByUserLoginId;
    }
public void setClosedByUserLoginId(String closedByUserLoginId) {
        this.closedByUserLoginId = closedByUserLoginId;
    }
public void setStartingDrawerAmount(BigDecimal startingDrawerAmount) {
        this.startingDrawerAmount = startingDrawerAmount;
    }
public void setActualEndingCash(BigDecimal actualEndingCash) {
        this.actualEndingCash = actualEndingCash;
    }
public void setActualEndingCheck(BigDecimal actualEndingCheck) {
        this.actualEndingCheck = actualEndingCheck;
    }
public void setActualEndingCc(BigDecimal actualEndingCc) {
        this.actualEndingCc = actualEndingCc;
    }
public void setActualEndingGc(BigDecimal actualEndingGc) {
        this.actualEndingGc = actualEndingGc;
    }
public void setActualEndingOther(BigDecimal actualEndingOther) {
        this.actualEndingOther = actualEndingOther;
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
