package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class TestFieldType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String testFieldTypeId;
    private String blobField;
    private LocalDate dateField;
    private LocalTime timeField;
    private LocalDateTime dateTimeField;
    private BigDecimal fixedPointField;
    private BigDecimal floatingPointField;
    private BigDecimal numericField;
    private String clobField;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setTestFieldTypeId(String testFieldTypeId) {
        this.testFieldTypeId = testFieldTypeId;
    }
public void setBlobField(String blobField) {
        this.blobField = blobField;
    }
public void setDateField(LocalDate dateField) {
        this.dateField = dateField;
    }
public void setTimeField(LocalTime timeField) {
        this.timeField = timeField;
    }
public void setDateTimeField(LocalDateTime dateTimeField) {
        this.dateTimeField = dateTimeField;
    }
public void setFixedPointField(BigDecimal fixedPointField) {
        this.fixedPointField = fixedPointField;
    }
public void setFloatingPointField(BigDecimal floatingPointField) {
        this.floatingPointField = floatingPointField;
    }
public void setNumericField(BigDecimal numericField) {
        this.numericField = numericField;
    }
public void setClobField(String clobField) {
        this.clobField = clobField;
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
