package com.example.erp.oms.common.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CountryAddressFormat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String geoId;

    private String geoAssocTypeId;

    private String requireStateProvinceId;

    private Boolean requirePostalCode;

    private String postalCodeRegex;

    private Boolean hasPostalCodeExt;

    private Boolean requirePostalCodeExt;

    private String addressFormat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGeoId() {
        return geoId;
    }

    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    public String getGeoAssocTypeId() {
        return geoAssocTypeId;
    }

    public void setGeoAssocTypeId(String geoAssocTypeId) {
        this.geoAssocTypeId = geoAssocTypeId;
    }

    public String getRequireStateProvinceId() {
        return requireStateProvinceId;
    }

    public void setRequireStateProvinceId(String requireStateProvinceId) {
        this.requireStateProvinceId = requireStateProvinceId;
    }

    public Boolean getRequirePostalCode() {
        return requirePostalCode;
    }

    public void setRequirePostalCode(Boolean requirePostalCode) {
        this.requirePostalCode = requirePostalCode;
    }

    public String getPostalCodeRegex() {
        return postalCodeRegex;
    }

    public void setPostalCodeRegex(String postalCodeRegex) {
        this.postalCodeRegex = postalCodeRegex;
    }

    public Boolean getHasPostalCodeExt() {
        return hasPostalCodeExt;
    }

    public void setHasPostalCodeExt(Boolean hasPostalCodeExt) {
        this.hasPostalCodeExt = hasPostalCodeExt;
    }

    public Boolean getRequirePostalCodeExt() {
        return requirePostalCodeExt;
    }

    public void setRequirePostalCodeExt(Boolean requirePostalCodeExt) {
        this.requirePostalCodeExt = requirePostalCodeExt;
    }

    public String getAddressFormat() {
        return addressFormat;
    }

    public void setAddressFormat(String addressFormat) {
        this.addressFormat = addressFormat;
    }
}
