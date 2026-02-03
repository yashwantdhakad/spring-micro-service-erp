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
public class RateAmount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rateTypeId;

    private String rateCurrencyUomId;

    private String periodTypeId;

    private String workEffortId;

    private String partyId;

    private String emplPositionTypeId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private BigDecimal rateAmount;
public void setId(Long id) {
        this.id = id;
    }
public void setRateTypeId(String rateTypeId) {
        this.rateTypeId = rateTypeId;
    }
public void setRateCurrencyUomId(String rateCurrencyUomId) {
        this.rateCurrencyUomId = rateCurrencyUomId;
    }
public void setPeriodTypeId(String periodTypeId) {
        this.periodTypeId = periodTypeId;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setEmplPositionTypeId(String emplPositionTypeId) {
        this.emplPositionTypeId = emplPositionTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setRateAmount(BigDecimal rateAmount) {
        this.rateAmount = rateAmount;
    }
}
