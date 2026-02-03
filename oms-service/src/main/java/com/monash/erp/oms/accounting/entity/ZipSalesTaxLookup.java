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
public class ZipSalesTaxLookup {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String zipCode;

    private String stateCode;

    private String city;

    private String county;

    private LocalDateTime fromDate;

    private String countyFips;

    private Boolean countyDefault;

    private Boolean generalDefault;

    private Boolean insideCity;

    private String geoCode;

    private BigDecimal stateSalesTax;

    private BigDecimal citySalesTax;

    private BigDecimal cityLocalSalesTax;

    private BigDecimal countySalesTax;

    private BigDecimal countyLocalSalesTax;

    private BigDecimal comboSalesTax;

    private BigDecimal stateUseTax;

    private BigDecimal cityUseTax;

    private BigDecimal cityLocalUseTax;

    private BigDecimal countyUseTax;

    private BigDecimal countyLocalUseTax;

    private BigDecimal comboUseTax;
public void setId(Long id) {
        this.id = id;
    }
public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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
public void setCountyFips(String countyFips) {
        this.countyFips = countyFips;
    }
public void setCountyDefault(Boolean countyDefault) {
        this.countyDefault = countyDefault;
    }
public void setGeneralDefault(Boolean generalDefault) {
        this.generalDefault = generalDefault;
    }
public void setInsideCity(Boolean insideCity) {
        this.insideCity = insideCity;
    }
public void setGeoCode(String geoCode) {
        this.geoCode = geoCode;
    }
public void setStateSalesTax(BigDecimal stateSalesTax) {
        this.stateSalesTax = stateSalesTax;
    }
public void setCitySalesTax(BigDecimal citySalesTax) {
        this.citySalesTax = citySalesTax;
    }
public void setCityLocalSalesTax(BigDecimal cityLocalSalesTax) {
        this.cityLocalSalesTax = cityLocalSalesTax;
    }
public void setCountySalesTax(BigDecimal countySalesTax) {
        this.countySalesTax = countySalesTax;
    }
public void setCountyLocalSalesTax(BigDecimal countyLocalSalesTax) {
        this.countyLocalSalesTax = countyLocalSalesTax;
    }
public void setComboSalesTax(BigDecimal comboSalesTax) {
        this.comboSalesTax = comboSalesTax;
    }
public void setStateUseTax(BigDecimal stateUseTax) {
        this.stateUseTax = stateUseTax;
    }
public void setCityUseTax(BigDecimal cityUseTax) {
        this.cityUseTax = cityUseTax;
    }
public void setCityLocalUseTax(BigDecimal cityLocalUseTax) {
        this.cityLocalUseTax = cityLocalUseTax;
    }
public void setCountyUseTax(BigDecimal countyUseTax) {
        this.countyUseTax = countyUseTax;
    }
public void setCountyLocalUseTax(BigDecimal countyLocalUseTax) {
        this.countyLocalUseTax = countyLocalUseTax;
    }
public void setComboUseTax(BigDecimal comboUseTax) {
        this.comboUseTax = comboUseTax;
    }
}
