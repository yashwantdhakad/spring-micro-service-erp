package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class FixedAssetMaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fixedAssetId;

    private String maintHistSeqId;

    private String statusId;

    private String productMaintTypeId;

    private String productMaintSeqId;

    private String scheduleWorkEffortId;

    private BigDecimal intervalQuantity;

    private String intervalUomId;

    private String intervalMeterTypeId;

    private String purchaseOrderId;
public void setId(Long id) {
        this.id = id;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setMaintHistSeqId(String maintHistSeqId) {
        this.maintHistSeqId = maintHistSeqId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setProductMaintTypeId(String productMaintTypeId) {
        this.productMaintTypeId = productMaintTypeId;
    }
public void setProductMaintSeqId(String productMaintSeqId) {
        this.productMaintSeqId = productMaintSeqId;
    }
public void setScheduleWorkEffortId(String scheduleWorkEffortId) {
        this.scheduleWorkEffortId = scheduleWorkEffortId;
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
public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }
}
