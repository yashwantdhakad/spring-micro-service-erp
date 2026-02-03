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
public void setId(Long id) {
        this.id = id;
    }
public void setTempExprId(String tempExprId) {
        this.tempExprId = tempExprId;
    }
public void setTempExprTypeId(String tempExprTypeId) {
        this.tempExprTypeId = tempExprTypeId;
    }
public void setDate1(LocalDateTime date1) {
        this.date1 = date1;
    }
public void setDate2(LocalDateTime date2) {
        this.date2 = date2;
    }
public void setInteger1(BigDecimal integer1) {
        this.integer1 = integer1;
    }
public void setInteger2(BigDecimal integer2) {
        this.integer2 = integer2;
    }
public void setString1(String string1) {
        this.string1 = string1;
    }
public void setString2(String string2) {
        this.string2 = string2;
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
public void setDescription(String description) {
        this.description = description;
    }

}
