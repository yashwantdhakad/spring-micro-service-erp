package com.monash.erp.oms.entity;

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

@Entity
@NoArgsConstructor
@Setter
@Getter
public class OrderSummaryEntry extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate entryDate;
    private String productId;
    private String facilityId;
    private BigDecimal totalQuantity;
    private BigDecimal grossSales;
    private BigDecimal productCost;
public void setId(Long id) {
        this.id = id;
    }
public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setTotalQuantity(BigDecimal totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
public void setGrossSales(BigDecimal grossSales) {
        this.grossSales = grossSales;
    }
public void setProductCost(BigDecimal productCost) {
        this.productCost = productCost;
    }

}
