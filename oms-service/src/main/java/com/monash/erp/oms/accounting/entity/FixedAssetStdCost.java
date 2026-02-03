package com.monash.erp.oms.accounting.entity;

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
public class FixedAssetStdCost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fixedAssetId;

    private String fixedAssetStdCostTypeId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private String amountUomId;

    private BigDecimal amount;
public void setId(Long id) {
        this.id = id;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setFixedAssetStdCostTypeId(String fixedAssetStdCostTypeId) {
        this.fixedAssetStdCostTypeId = fixedAssetStdCostTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setAmountUomId(String amountUomId) {
        this.amountUomId = amountUomId;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
