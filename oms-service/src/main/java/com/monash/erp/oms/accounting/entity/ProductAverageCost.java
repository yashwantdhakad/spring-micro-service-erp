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
public class ProductAverageCost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productAverageCostTypeId;

    private String organizationPartyId;

    private String productId;

    private String facilityId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private BigDecimal averageCost;
public void setId(Long id) {
        this.id = id;
    }
public void setProductAverageCostTypeId(String productAverageCostTypeId) {
        this.productAverageCostTypeId = productAverageCostTypeId;
    }
public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setAverageCost(BigDecimal averageCost) {
        this.averageCost = averageCost;
    }
}
