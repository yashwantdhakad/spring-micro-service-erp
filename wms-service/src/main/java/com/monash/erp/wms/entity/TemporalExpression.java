package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class TemporalExpression {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tempExprId;
    private String tempExprTypeId;
    private LocalDateTime date1;
    private LocalDateTime date2;
    private BigDecimal integer1;
    private BigDecimal integer2;
    private String string1;
    private String string2;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTempExprId() {
        return tempExprId;
    }

    public void setTempExprId(String tempExprId) {
        this.tempExprId = tempExprId;
    }

    public String getTempExprTypeId() {
        return tempExprTypeId;
    }

    public void setTempExprTypeId(String tempExprTypeId) {
        this.tempExprTypeId = tempExprTypeId;
    }

    public LocalDateTime getDate1() {
        return date1;
    }

    public void setDate1(LocalDateTime date1) {
        this.date1 = date1;
    }

    public LocalDateTime getDate2() {
        return date2;
    }

    public void setDate2(LocalDateTime date2) {
        this.date2 = date2;
    }

    public BigDecimal getInteger1() {
        return integer1;
    }

    public void setInteger1(BigDecimal integer1) {
        this.integer1 = integer1;
    }

    public BigDecimal getInteger2() {
        return integer2;
    }

    public void setInteger2(BigDecimal integer2) {
        this.integer2 = integer2;
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}