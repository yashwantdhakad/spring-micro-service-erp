package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class AccommodationSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accommodationSpotId;

    private String accommodationClassId;

    private String fixedAssetId;

    private BigDecimal numberOfSpaces;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccommodationSpotId() {
        return accommodationSpotId;
    }

    public void setAccommodationSpotId(String accommodationSpotId) {
        this.accommodationSpotId = accommodationSpotId;
    }

    public String getAccommodationClassId() {
        return accommodationClassId;
    }

    public void setAccommodationClassId(String accommodationClassId) {
        this.accommodationClassId = accommodationClassId;
    }

    public String getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public BigDecimal getNumberOfSpaces() {
        return numberOfSpaces;
    }

    public void setNumberOfSpaces(BigDecimal numberOfSpaces) {
        this.numberOfSpaces = numberOfSpaces;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
