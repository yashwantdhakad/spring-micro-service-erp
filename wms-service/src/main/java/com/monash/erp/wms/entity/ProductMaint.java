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
public class ProductMaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;
    private String productMaintSeqId;
    private String productMaintTypeId;
    private String maintName;
    private String maintTemplateWorkEffortId;
    private BigDecimal intervalQuantity;
    private String intervalUomId;
    private String intervalMeterTypeId;
    private BigDecimal repeatCount;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductMaintSeqId(String productMaintSeqId) {
        this.productMaintSeqId = productMaintSeqId;
    }
public void setProductMaintTypeId(String productMaintTypeId) {
        this.productMaintTypeId = productMaintTypeId;
    }
public void setMaintName(String maintName) {
        this.maintName = maintName;
    }
public void setMaintTemplateWorkEffortId(String maintTemplateWorkEffortId) {
        this.maintTemplateWorkEffortId = maintTemplateWorkEffortId;
    }
public void setIntervalQuantity(BigDecimal intervalQuantity) {
        this.intervalQuantity = intervalQuantity;
    }
public void setIntervalUomId(String intervalUomId) {
        this.intervalUomId = intervalUomId;
    }
public void setIntervalMeterTypeId(String intervalMeterTypeId) {
        this.intervalMeterTypeId = intervalMeterTypeId;
    }
public void setRepeatCount(BigDecimal repeatCount) {
        this.repeatCount = repeatCount;
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
