package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class ZipSalesRuleLookup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stateCode;

    private String city;

    private String county;

    private LocalDateTime fromDate;

    private String idCode;

    private String taxable;

    private String shipCond;
public void setId(Long id) {
        this.id = id;
    }
public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }
public void setCity(String city) {
        this.city = city;
    }
public void setCounty(String county) {
        this.county = county;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setIdCode(String idCode) {
        this.idCode = idCode;
    }
public void setTaxable(String taxable) {
        this.taxable = taxable;
    }
public void setShipCond(String shipCond) {
        this.shipCond = shipCond;
    }
}
