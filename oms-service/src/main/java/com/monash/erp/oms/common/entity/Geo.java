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
public class Geo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String geoId;

    private String geoTypeId;

    private String geoName;

    private String geoCode;

    private String geoSecCode;

    private String abbreviation;

    private String wellKnownText;
public void setId(Long id) {
        this.id = id;
    }
public void setGeoId(String geoId) {
        this.geoId = geoId;
    }
public void setGeoTypeId(String geoTypeId) {
        this.geoTypeId = geoTypeId;
    }
public void setGeoName(String geoName) {
        this.geoName = geoName;
    }
public void setGeoCode(String geoCode) {
        this.geoCode = geoCode;
    }
public void setGeoSecCode(String geoSecCode) {
        this.geoSecCode = geoSecCode;
    }
public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
public void setWellKnownText(String wellKnownText) {
        this.wellKnownText = wellKnownText;
    }
}
