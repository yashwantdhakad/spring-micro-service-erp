package com.monash.erp.oms.common.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setGeoId(String geoId) {
        this.geoId = geoId;
    }
public void setGeoAssocTypeId(String geoAssocTypeId) {
        this.geoAssocTypeId = geoAssocTypeId;
    }
public void setRequireStateProvinceId(String requireStateProvinceId) {
        this.requireStateProvinceId = requireStateProvinceId;
    }
public void setRequirePostalCode(Boolean requirePostalCode) {
        this.requirePostalCode = requirePostalCode;
    }
public void setPostalCodeRegex(String postalCodeRegex) {
        this.postalCodeRegex = postalCodeRegex;
    }
public void setHasPostalCodeExt(Boolean hasPostalCodeExt) {
        this.hasPostalCodeExt = hasPostalCodeExt;
    }
public void setRequirePostalCodeExt(Boolean requirePostalCodeExt) {
        this.requirePostalCodeExt = requirePostalCodeExt;
    }
public void setAddressFormat(String addressFormat) {
        this.addressFormat = addressFormat;
    }
}
